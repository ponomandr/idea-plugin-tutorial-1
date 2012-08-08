package idea.plugin.jmeter;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class JMeterFileType implements FileType {
    public static final JMeterFileType INSTANCE = new JMeterFileType();

    @NotNull
    @Override
    public String getName() {
        return "JMeter";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "JMeter file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "jmx";
    }

    @Override
    public Icon getIcon() {
        return IconLoader.getIcon("/icons/beaker.png");
    }

    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Override
    public String getCharset(@NotNull VirtualFile virtualFile, byte[] bytes) {
        return CharsetToolkit.UTF8;
    }
}
