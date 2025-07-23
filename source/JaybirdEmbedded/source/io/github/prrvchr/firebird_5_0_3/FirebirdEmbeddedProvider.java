package io.github.prrvchr.firebird_5_0_3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.sun.jna.Platform;

import org.firebirdsql.jna.embedded.classpath.ClasspathFirebirdEmbeddedLibrary;
import org.firebirdsql.jna.embedded.classpath.ClasspathFirebirdEmbeddedResource;
import org.firebirdsql.jna.embedded.spi.FirebirdEmbeddedLoadingException;
import org.firebirdsql.jna.embedded.spi.FirebirdEmbeddedLibrary;

public class FirebirdEmbeddedProvider 
        implements org.firebirdsql.jna.embedded.spi.FirebirdEmbeddedProvider {

    private static final String SERVER_VERSION = "V5.0.3.16830 Firebird 5.0";
    private static final String PREFIX = Platform.RESOURCE_PREFIX;

    @Override
    public String getPlatform() {
        return PREFIX;
    }

    @Override
    public String getVersion() {
        String prefix = null;
        switch (Platform.getOSType()) {
            case Platform.LINUX:
                prefix = "LI-";
                break;
            case Platform.WINDOWS:
                prefix = "WI-";
                break;
        }
        return prefix + SERVER_VERSION;
    }

    @Override
    public FirebirdEmbeddedLibrary getFirebirdEmbeddedLibrary() 
            throws FirebirdEmbeddedLoadingException {
        return ClasspathFirebirdEmbeddedLibrary.load(this, new ResourceInfo());
    }

    private static class ResourceInfo implements ClasspathFirebirdEmbeddedResource {

        @Override
        public String getLibraryEntryPoint() {
            String entry = null;
            switch (Platform.getOSType()) {
                case Platform.LINUX:
                    entry = PREFIX + "/lib/libfbclient.so";
                    break;
                case Platform.WINDOWS:
                    entry = PREFIX + "/fbclient.dll";
                    break;
            }
            return entry;
        }

        @Override
        public Collection<String> getResourceList() {
            List<String> resources = null;
            switch (Platform.getOSType()) {
                case Platform.LINUX:
                    resources = Arrays.asList(PREFIX + "/intl/fbintl.conf",
                                              PREFIX + "/intl/fbintl",
                                              PREFIX + "/lib/libfbclient.so",
                                              PREFIX + "/lib/libfbclient.so.2",
                                              PREFIX + "/lib/libfbclient.so.5.0.3",
                                              PREFIX + "/lib/libib_util.so",
                                              PREFIX + "/lib/libtomcrypt.so",
                                              PREFIX + "/lib/libtomcrypt.so.1",
                                              PREFIX + "/lib/libtomcrypt.so.1.0.1",
                                              PREFIX + "/lib/libtommath.so",
                                              PREFIX + "/lib/libtommath.so.0.0.41",
                                              PREFIX + "/lib/libtommath.so.1",
                                              PREFIX + "/plugins/libEngine13.so",
                                              PREFIX + "/plugins/libudr_engine.so",
                                              PREFIX + "/plugins/udr_engine.conf",
                                              PREFIX + "/firebird.conf",
                                              PREFIX + "/firebird.msg",
                                              PREFIX + "/plugins.conf");
                    break;
                case Platform.WINDOWS:
                    resources = Arrays.asList(PREFIX + "/intl/fbintl.conf",
                                              PREFIX + "/intl/fbintl.dll",
                                              PREFIX + "/plugins/engine13.dll",
                                              PREFIX + "/plugins/udr_engine.conf",
                                              PREFIX + "/plugins/udr_engine.dll",
                                              PREFIX + "/fbclient.dll",
                                              PREFIX + "/firebird.conf",
                                              PREFIX + "/firebird.msg",
                                              PREFIX + "/ib_util.dll",
                                              PREFIX + "/icudt63.dll",
                                              PREFIX + "/icudt63l.dat",
                                              PREFIX + "/icuin63.dll",
                                              PREFIX + "/icuuc63.dll",
                                              PREFIX + "/plugins.conf");
                    break;
            }
            return resources;
        }
    }
}

