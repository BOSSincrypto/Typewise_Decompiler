package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.C0707b;
import kotlin.collections.C0709d;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import m2.C0821b;
import v2.C0925a;
import v2.c;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 a*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003ba#B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u001dJ5\u0010+\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010*\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u00028\u00002\u0006\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010&J \u00103\u001a\u00028\u00002\u0006\u00101\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b7\u00106J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010>J\u0017\u0010?\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010?\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010 J\u001d\u0010A\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\bA\u0010BJ%\u0010A\u001a\u00020\u00192\u0006\u00101\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\bA\u0010CJ\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010\u0011J\u0017\u0010E\u001a\u00028\u00002\u0006\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\bE\u0010&J\u0017\u0010F\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bF\u0010@J\u001d\u0010G\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\bG\u0010BJ\u001d\u0010H\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\bH\u0010BJ%\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bK\u0010LJ)\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010N\"\u0004\b\u0001\u0010M2\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00010NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0NH\u0016¢\u0006\u0004\bP\u0010RJ\u001a\u0010S\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\bS\u0010@J\u000f\u0010T\u001a\u00020\bH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b_\u0010U¨\u0006c"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "Ll2/q;", "i", "()V", "d", "n", "g", "minCapacity", "f", "", "other", "", "e", "(Ljava/util/List;)Z", "h", "(II)V", "element", "c", "(ILjava/lang/Object;)V", "", "elements", "b", "(ILjava/util/Collection;I)V", "j", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "k", "retain", "l", "(IILjava/util/Collection;Z)I", "build", "()Ljava/util/List;", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "backing", "[Ljava/lang/Object;", "length", "I", "isReadOnly", "Z", "getSize", "size", "a", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ListBuilder<E> extends C0709d implements List<E>, RandomAccess, Serializable, c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f13837a = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private static final ListBuilder f13838b;
    /* access modifiers changed from: private */
    public E[] backing;
    /* access modifiers changed from: private */
    public boolean isReadOnly;
    /* access modifiers changed from: private */
    public int length;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001aBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001b\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0002¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010\u001f\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010(J\u001f\u0010+\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010,J5\u0010.\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010-\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001cH\u0016¢\u0006\u0004\b0\u00101J\u0018\u00103\u001a\u00028\u00012\u0006\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u0010(J \u00104\u001a\u00028\u00012\u0006\u00102\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b8\u00107J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000109H\u0002¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010<H\u0016¢\u0006\u0004\b=\u0010>J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010<2\u0006\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010?J\u0017\u0010@\u001a\u00020\u001c2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010@\u001a\u00020\u00152\u0006\u00102\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b@\u0010\"J\u001d\u0010B\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bB\u0010CJ%\u0010B\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bB\u0010DJ\u000f\u0010E\u001a\u00020\u0015H\u0016¢\u0006\u0004\bE\u0010\u0017J\u0017\u0010F\u001a\u00028\u00012\u0006\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010(J\u0017\u0010G\u001a\u00020\u001c2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\bG\u0010AJ\u001d\u0010H\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bH\u0010CJ\u001d\u0010I\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\bI\u0010CJ%\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010J\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u0010N2\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\bH\u0016¢\u0006\u0004\bP\u0010RJ\u001a\u0010S\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bS\u0010AJ\u000f\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ZR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010ZR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010[R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\\R\u0014\u0010^\u001a\u00020\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\b]\u00101R\u0014\u0010`\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b_\u0010U¨\u0006b"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "Lkotlin/collections/builders/ListBuilder;", "root", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ll2/q;", "h", "()V", "d", "e", "", "other", "", "f", "(Ljava/util/List;)Z", "i", "element", "c", "(ILjava/lang/Object;)V", "", "elements", "n", "b", "(ILjava/util/Collection;I)V", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "j", "(II)V", "retain", "k", "(IILjava/util/Collection;Z)I", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[Ljava/lang/Object;", "I", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "Lkotlin/collections/builders/ListBuilder;", "g", "isReadOnly", "getSize", "size", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuilderSubList<E> extends C0709d implements List<E>, RandomAccess, Serializable, c {
        /* access modifiers changed from: private */
        public E[] backing;
        /* access modifiers changed from: private */
        public int length;
        /* access modifiers changed from: private */
        public final int offset;
        private final BuilderSubList<E> parent;
        /* access modifiers changed from: private */
        public final ListBuilder<E> root;

        private static final class a implements ListIterator, C0925a {

            /* renamed from: a  reason: collision with root package name */
            private final BuilderSubList f13839a;

            /* renamed from: b  reason: collision with root package name */
            private int f13840b;

            /* renamed from: c  reason: collision with root package name */
            private int f13841c = -1;

            /* renamed from: d  reason: collision with root package name */
            private int f13842d;

            public a(BuilderSubList builderSubList, int i4) {
                o.e(builderSubList, "list");
                this.f13839a = builderSubList;
                this.f13840b = i4;
                this.f13842d = builderSubList.modCount;
            }

            private final void b() {
                if (this.f13839a.root.modCount != this.f13842d) {
                    throw new ConcurrentModificationException();
                }
            }

            public void add(Object obj) {
                b();
                BuilderSubList builderSubList = this.f13839a;
                int i4 = this.f13840b;
                this.f13840b = i4 + 1;
                builderSubList.add(i4, obj);
                this.f13841c = -1;
                this.f13842d = this.f13839a.modCount;
            }

            public boolean hasNext() {
                if (this.f13840b < this.f13839a.length) {
                    return true;
                }
                return false;
            }

            public boolean hasPrevious() {
                if (this.f13840b > 0) {
                    return true;
                }
                return false;
            }

            public Object next() {
                b();
                if (this.f13840b < this.f13839a.length) {
                    int i4 = this.f13840b;
                    this.f13840b = i4 + 1;
                    this.f13841c = i4;
                    return this.f13839a.backing[this.f13839a.offset + this.f13841c];
                }
                throw new NoSuchElementException();
            }

            public int nextIndex() {
                return this.f13840b;
            }

            public Object previous() {
                b();
                int i4 = this.f13840b;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    this.f13840b = i5;
                    this.f13841c = i5;
                    return this.f13839a.backing[this.f13839a.offset + this.f13841c];
                }
                throw new NoSuchElementException();
            }

            public int previousIndex() {
                return this.f13840b - 1;
            }

            public void remove() {
                b();
                int i4 = this.f13841c;
                if (i4 != -1) {
                    this.f13839a.remove(i4);
                    this.f13840b = this.f13841c;
                    this.f13841c = -1;
                    this.f13842d = this.f13839a.modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            public void set(Object obj) {
                b();
                int i4 = this.f13841c;
                if (i4 != -1) {
                    this.f13839a.set(i4, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }

        public BuilderSubList(E[] eArr, int i4, int i5, BuilderSubList<E> builderSubList, ListBuilder<E> listBuilder) {
            o.e(eArr, "backing");
            o.e(listBuilder, "root");
            this.backing = eArr;
            this.offset = i4;
            this.length = i5;
            this.parent = builderSubList;
            this.root = listBuilder;
            this.modCount = listBuilder.modCount;
        }

        private final void b(int i4, Collection collection, int i5) {
            h();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.b(i4, collection, i5);
            } else {
                this.root.b(i4, collection, i5);
            }
            this.backing = this.root.backing;
            this.length += i5;
        }

        private final void c(int i4, Object obj) {
            h();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.c(i4, obj);
            } else {
                this.root.c(i4, obj);
            }
            this.backing = this.root.backing;
            this.length++;
        }

        private final void d() {
            if (this.root.modCount != this.modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void e() {
            if (g()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean f(List list) {
            return C0821b.h(this.backing, this.offset, this.length, list);
        }

        private final boolean g() {
            return this.root.isReadOnly;
        }

        private final void h() {
            this.modCount++;
        }

        private final Object i(int i4) {
            Object obj;
            h();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                obj = builderSubList.i(i4);
            } else {
                obj = this.root.j(i4);
            }
            this.length--;
            return obj;
        }

        private final void j(int i4, int i5) {
            if (i5 > 0) {
                h();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.j(i4, i5);
            } else {
                this.root.k(i4, i5);
            }
            this.length -= i5;
        }

        private final int k(int i4, int i5, Collection collection, boolean z3) {
            int i6;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                i6 = builderSubList.k(i4, i5, collection, z3);
            } else {
                i6 = this.root.l(i4, i5, collection, z3);
            }
            if (i6 > 0) {
                h();
            }
            this.length -= i6;
            return i6;
        }

        private final Object writeReplace() {
            if (g()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        public boolean add(E e4) {
            e();
            d();
            c(this.offset + this.length, e4);
            return true;
        }

        public boolean addAll(Collection<? extends E> collection) {
            o.e(collection, "elements");
            e();
            d();
            int size = collection.size();
            b(this.offset + this.length, collection, size);
            return size > 0;
        }

        public void clear() {
            e();
            d();
            j(this.offset, this.length);
        }

        public boolean equals(Object obj) {
            d();
            if (obj == this || ((obj instanceof List) && f((List) obj))) {
                return true;
            }
            return false;
        }

        public E get(int i4) {
            d();
            C0707b.Companion.b(i4, this.length);
            return this.backing[this.offset + i4];
        }

        public int getSize() {
            d();
            return this.length;
        }

        public int hashCode() {
            d();
            return C0821b.i(this.backing, this.offset, this.length);
        }

        public int indexOf(Object obj) {
            d();
            for (int i4 = 0; i4 < this.length; i4++) {
                if (o.a(this.backing[this.offset + i4], obj)) {
                    return i4;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            d();
            if (this.length == 0) {
                return true;
            }
            return false;
        }

        public Iterator<E> iterator() {
            return listIterator(0);
        }

        public int lastIndexOf(Object obj) {
            d();
            for (int i4 = this.length - 1; i4 >= 0; i4--) {
                if (o.a(this.backing[this.offset + i4], obj)) {
                    return i4;
                }
            }
            return -1;
        }

        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public boolean remove(Object obj) {
            e();
            d();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            if (indexOf >= 0) {
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            o.e(collection, "elements");
            e();
            d();
            if (k(this.offset, this.length, collection, false) > 0) {
                return true;
            }
            return false;
        }

        public E removeAt(int i4) {
            e();
            d();
            C0707b.Companion.b(i4, this.length);
            return i(this.offset + i4);
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            o.e(collection, "elements");
            e();
            d();
            if (k(this.offset, this.length, collection, true) > 0) {
                return true;
            }
            return false;
        }

        public E set(int i4, E e4) {
            e();
            d();
            C0707b.Companion.b(i4, this.length);
            E[] eArr = this.backing;
            int i5 = this.offset;
            E e5 = eArr[i5 + i4];
            eArr[i5 + i4] = e4;
            return e5;
        }

        public List<E> subList(int i4, int i5) {
            C0707b.Companion.d(i4, i5, this.length);
            return new BuilderSubList(this.backing, this.offset + i4, i5 - i4, this, this.root);
        }

        public <T> T[] toArray(T[] tArr) {
            o.e(tArr, "array");
            d();
            int length2 = tArr.length;
            int i4 = this.length;
            if (length2 < i4) {
                E[] eArr = this.backing;
                int i5 = this.offset;
                T[] copyOfRange = Arrays.copyOfRange(eArr, i5, i4 + i5, tArr.getClass());
                o.d(copyOfRange, "copyOfRange(...)");
                return copyOfRange;
            }
            E[] eArr2 = this.backing;
            int i6 = this.offset;
            C0713h.e(eArr2, tArr, 0, i6, i4 + i6);
            return C0718m.f(this.length, tArr);
        }

        public String toString() {
            d();
            return C0821b.j(this.backing, this.offset, this.length, this);
        }

        public ListIterator<E> listIterator(int i4) {
            d();
            C0707b.Companion.c(i4, this.length);
            return new a(this, i4);
        }

        public void add(int i4, E e4) {
            e();
            d();
            C0707b.Companion.c(i4, this.length);
            c(this.offset + i4, e4);
        }

        public boolean addAll(int i4, Collection<? extends E> collection) {
            o.e(collection, "elements");
            e();
            d();
            C0707b.Companion.c(i4, this.length);
            int size = collection.size();
            b(this.offset + i4, collection, size);
            return size > 0;
        }

        public Object[] toArray() {
            d();
            E[] eArr = this.backing;
            int i4 = this.offset;
            return C0713h.i(eArr, i4, this.length + i4);
        }
    }

    private static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements ListIterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final ListBuilder f13843a;

        /* renamed from: b  reason: collision with root package name */
        private int f13844b;

        /* renamed from: c  reason: collision with root package name */
        private int f13845c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f13846d;

        public b(ListBuilder listBuilder, int i4) {
            o.e(listBuilder, "list");
            this.f13843a = listBuilder;
            this.f13844b = i4;
            this.f13846d = listBuilder.modCount;
        }

        private final void b() {
            if (this.f13843a.modCount != this.f13846d) {
                throw new ConcurrentModificationException();
            }
        }

        public void add(Object obj) {
            b();
            ListBuilder listBuilder = this.f13843a;
            int i4 = this.f13844b;
            this.f13844b = i4 + 1;
            listBuilder.add(i4, obj);
            this.f13845c = -1;
            this.f13846d = this.f13843a.modCount;
        }

        public boolean hasNext() {
            if (this.f13844b < this.f13843a.length) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.f13844b > 0) {
                return true;
            }
            return false;
        }

        public Object next() {
            b();
            if (this.f13844b < this.f13843a.length) {
                int i4 = this.f13844b;
                this.f13844b = i4 + 1;
                this.f13845c = i4;
                return this.f13843a.backing[this.f13845c];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f13844b;
        }

        public Object previous() {
            b();
            int i4 = this.f13844b;
            if (i4 > 0) {
                int i5 = i4 - 1;
                this.f13844b = i5;
                this.f13845c = i5;
                return this.f13843a.backing[this.f13845c];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f13844b - 1;
        }

        public void remove() {
            b();
            int i4 = this.f13845c;
            if (i4 != -1) {
                this.f13843a.remove(i4);
                this.f13844b = this.f13845c;
                this.f13845c = -1;
                this.f13846d = this.f13843a.modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        public void set(Object obj) {
            b();
            int i4 = this.f13845c;
            if (i4 != -1) {
                this.f13843a.set(i4, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        f13838b = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, (i) null);
    }

    /* access modifiers changed from: private */
    public final void b(int i4, Collection collection, int i5) {
        i();
        h(i4, i5);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i5; i6++) {
            this.backing[i4 + i6] = it.next();
        }
    }

    /* access modifiers changed from: private */
    public final void c(int i4, Object obj) {
        i();
        h(i4, 1);
        this.backing[i4] = obj;
    }

    private final void d() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean e(List list) {
        return C0821b.h(this.backing, 0, this.length, list);
    }

    private final void f(int i4) {
        if (i4 >= 0) {
            E[] eArr = this.backing;
            if (i4 > eArr.length) {
                this.backing = C0821b.e(this.backing, C0707b.Companion.e(eArr.length, i4));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void g(int i4) {
        f(this.length + i4);
    }

    private final void h(int i4, int i5) {
        g(i5);
        E[] eArr = this.backing;
        C0713h.e(eArr, eArr, i4 + i5, i4, this.length);
        this.length += i5;
    }

    private final void i() {
        this.modCount++;
    }

    /* access modifiers changed from: private */
    public final Object j(int i4) {
        i();
        E[] eArr = this.backing;
        E e4 = eArr[i4];
        C0713h.e(eArr, eArr, i4, i4 + 1, this.length);
        C0821b.f(this.backing, this.length - 1);
        this.length--;
        return e4;
    }

    /* access modifiers changed from: private */
    public final void k(int i4, int i5) {
        if (i5 > 0) {
            i();
        }
        E[] eArr = this.backing;
        C0713h.e(eArr, eArr, i4, i4 + i5, this.length);
        E[] eArr2 = this.backing;
        int i6 = this.length;
        C0821b.g(eArr2, i6 - i5, i6);
        this.length -= i5;
    }

    /* access modifiers changed from: private */
    public final int l(int i4, int i5, Collection collection, boolean z3) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = i4 + i6;
            if (collection.contains(this.backing[i8]) == z3) {
                E[] eArr = this.backing;
                i6++;
                eArr[i7 + i4] = eArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i5 - i7;
        E[] eArr2 = this.backing;
        C0713h.e(eArr2, eArr2, i4 + i7, i5 + i4, this.length);
        E[] eArr3 = this.backing;
        int i10 = this.length;
        C0821b.g(eArr3, i10 - i9, i10);
        if (i9 > 0) {
            i();
        }
        this.length -= i9;
        return i9;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public boolean add(E e4) {
        d();
        c(this.length, e4);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        o.e(collection, "elements");
        d();
        int size = collection.size();
        b(this.length, collection, size);
        return size > 0;
    }

    public final List<E> build() {
        d();
        this.isReadOnly = true;
        if (this.length > 0) {
            return this;
        }
        return f13838b;
    }

    public void clear() {
        d();
        k(0, this.length);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof List) && e((List) obj))) {
            return true;
        }
        return false;
    }

    public E get(int i4) {
        C0707b.Companion.b(i4, this.length);
        return this.backing[i4];
    }

    public int getSize() {
        return this.length;
    }

    public int hashCode() {
        return C0821b.i(this.backing, 0, this.length);
    }

    public int indexOf(Object obj) {
        for (int i4 = 0; i4 < this.length; i4++) {
            if (o.a(this.backing[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator<E> iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        for (int i4 = this.length - 1; i4 >= 0; i4--) {
            if (o.a(this.backing[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public boolean remove(Object obj) {
        d();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        o.e(collection, "elements");
        d();
        if (l(0, this.length, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public E removeAt(int i4) {
        d();
        C0707b.Companion.b(i4, this.length);
        return j(i4);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        o.e(collection, "elements");
        d();
        if (l(0, this.length, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public E set(int i4, E e4) {
        d();
        C0707b.Companion.b(i4, this.length);
        E[] eArr = this.backing;
        E e5 = eArr[i4];
        eArr[i4] = e4;
        return e5;
    }

    public List<E> subList(int i4, int i5) {
        C0707b.Companion.d(i4, i5, this.length);
        return new BuilderSubList(this.backing, i4, i5 - i4, (BuilderSubList) null, this);
    }

    public <T> T[] toArray(T[] tArr) {
        o.e(tArr, "array");
        int length2 = tArr.length;
        int i4 = this.length;
        if (length2 < i4) {
            T[] copyOfRange = Arrays.copyOfRange(this.backing, 0, i4, tArr.getClass());
            o.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        C0713h.e(this.backing, tArr, 0, 0, i4);
        return C0718m.f(this.length, tArr);
    }

    public String toString() {
        return C0821b.j(this.backing, 0, this.length, this);
    }

    public ListBuilder(int i4) {
        this.backing = C0821b.d(i4);
    }

    public ListIterator<E> listIterator(int i4) {
        C0707b.Companion.c(i4, this.length);
        return new b(this, i4);
    }

    public void add(int i4, E e4) {
        d();
        C0707b.Companion.c(i4, this.length);
        c(i4, e4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListBuilder(int i4, int i5, i iVar) {
        this((i5 & 1) != 0 ? 10 : i4);
    }

    public boolean addAll(int i4, Collection<? extends E> collection) {
        o.e(collection, "elements");
        d();
        C0707b.Companion.c(i4, this.length);
        int size = collection.size();
        b(i4, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        return C0713h.i(this.backing, 0, this.length);
    }
}
