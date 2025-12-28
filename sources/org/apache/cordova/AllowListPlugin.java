package org.apache.cordova;

import android.content.Context;
import org.xmlpull.v1.XmlPullParser;

public class AllowListPlugin extends CordovaPlugin {
    protected static final String LOG_TAG = "CordovaAllowListPlugin";
    public static final String PLUGIN_NAME = "CordovaAllowListPlugin";
    /* access modifiers changed from: private */
    public AllowList allowedIntents;
    /* access modifiers changed from: private */
    public AllowList allowedNavigations;
    /* access modifiers changed from: private */
    public AllowList allowedRequests;

    private class CustomConfigXmlParser extends ConfigXmlParser {
        private CordovaPreferences prefs;

        private CustomConfigXmlParser() {
            this.prefs = new CordovaPreferences();
        }

        public void handleEndTag(XmlPullParser xmlPullParser) {
        }

        public void handleStartTag(XmlPullParser xmlPullParser) {
            String attributeValue;
            String name = xmlPullParser.getName();
            boolean z3 = false;
            if (name.equals("content")) {
                AllowListPlugin.this.allowedNavigations.addAllowListEntry(xmlPullParser.getAttributeValue((String) null, "src"), false);
            } else if (name.equals("allow-navigation")) {
                String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "href");
                if ("*".equals(attributeValue2)) {
                    AllowListPlugin.this.allowedNavigations.addAllowListEntry("http://*/*", false);
                    AllowListPlugin.this.allowedNavigations.addAllowListEntry("https://*/*", false);
                    AllowListPlugin.this.allowedNavigations.addAllowListEntry("data:*", false);
                    return;
                }
                AllowListPlugin.this.allowedNavigations.addAllowListEntry(attributeValue2, false);
            } else if (name.equals("allow-intent")) {
                AllowListPlugin.this.allowedIntents.addAllowListEntry(xmlPullParser.getAttributeValue((String) null, "href"), false);
            } else if (name.equals("access") && (attributeValue = xmlPullParser.getAttributeValue((String) null, "origin")) != null) {
                if ("*".equals(attributeValue)) {
                    AllowListPlugin.this.allowedRequests.addAllowListEntry("http://*/*", false);
                    AllowListPlugin.this.allowedRequests.addAllowListEntry("https://*/*", false);
                    return;
                }
                String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "subdomains");
                AllowList access$300 = AllowListPlugin.this.allowedRequests;
                if (attributeValue3 != null && attributeValue3.compareToIgnoreCase("true") == 0) {
                    z3 = true;
                }
                access$300.addAllowListEntry(attributeValue, z3);
            }
        }
    }

    public AllowListPlugin() {
    }

    public AllowList getAllowedIntents() {
        return this.allowedIntents;
    }

    public AllowList getAllowedNavigations() {
        return this.allowedNavigations;
    }

    public AllowList getAllowedRequests() {
        return this.allowedRequests;
    }

    public void pluginInitialize() {
        if (this.allowedNavigations == null) {
            this.allowedNavigations = new AllowList();
            this.allowedIntents = new AllowList();
            this.allowedRequests = new AllowList();
            new CustomConfigXmlParser().parse(this.webView.getContext());
        }
    }

    public void setAllowedIntents(AllowList allowList) {
        this.allowedIntents = allowList;
    }

    public void setAllowedNavigations(AllowList allowList) {
        this.allowedNavigations = allowList;
    }

    public void setAllowedRequests(AllowList allowList) {
        this.allowedRequests = allowList;
    }

    public Boolean shouldAllowNavigation(String str) {
        if (this.allowedNavigations.isUrlAllowListed(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Boolean shouldAllowRequest(String str) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(shouldAllowNavigation(str)) || this.allowedRequests.isUrlAllowListed(str)) {
            return bool;
        }
        return null;
    }

    public Boolean shouldOpenExternalUrl(String str) {
        if (this.allowedIntents.isUrlAllowListed(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public AllowListPlugin(Context context) {
        this(new AllowList(), new AllowList(), (AllowList) null);
        new CustomConfigXmlParser().parse(context);
    }

    public AllowListPlugin(XmlPullParser xmlPullParser) {
        this(new AllowList(), new AllowList(), (AllowList) null);
        new CustomConfigXmlParser().parse(xmlPullParser);
    }

    public AllowListPlugin(AllowList allowList, AllowList allowList2, AllowList allowList3) {
        if (allowList3 == null) {
            allowList3 = new AllowList();
            allowList3.addAllowListEntry("file:///*", false);
            allowList3.addAllowListEntry("data:*", false);
        }
        this.allowedNavigations = allowList;
        this.allowedIntents = allowList2;
        this.allowedRequests = allowList3;
    }
}
