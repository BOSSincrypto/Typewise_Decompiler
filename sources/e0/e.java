package E0;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.o;

public abstract class e {
    public static final MappedByteBuffer a(File file) {
        o.e(file, "<this>");
        FileChannel channel = new RandomAccessFile(file, "r").getChannel();
        o.d(channel, "getChannel(...)");
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
        o.d(map, "map(...)");
        channel.close();
        return map;
    }
}
