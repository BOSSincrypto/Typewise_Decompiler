package com.silkimen.http;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.MalformedInputException;

public class HttpBodyDecoder {
    private static final String[] ACCEPTED_CHARSETS = {HttpRequest.CHARSET_UTF8, "ISO-8859-1"};

    private static CharsetDecoder createCharsetDecoder(String str) {
        CharsetDecoder newDecoder = Charset.forName(str).newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        return newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static String decodeBody(byte[] bArr, String str) {
        return decodeBody(ByteBuffer.wrap(bArr), str);
    }

    private static String decodeByteBuffer(ByteBuffer byteBuffer, String str) {
        return createCharsetDecoder(str).decode(byteBuffer).toString();
    }

    private static String tryDecodeByteBuffer(ByteBuffer byteBuffer) {
        int i4 = 0;
        while (true) {
            String[] strArr = ACCEPTED_CHARSETS;
            if (i4 >= strArr.length - 1) {
                return decodeBody(byteBuffer, strArr[strArr.length - 1]);
            }
            try {
                return decodeByteBuffer(byteBuffer, strArr[i4]);
            } catch (CharacterCodingException | MalformedInputException unused) {
                i4++;
            }
        }
    }

    public static String decodeBody(ByteBuffer byteBuffer, String str) {
        if (str == null) {
            return tryDecodeByteBuffer(byteBuffer);
        }
        return decodeByteBuffer(byteBuffer, str);
    }
}
