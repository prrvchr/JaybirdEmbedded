module FirebirdEmbeddedProvider {
    provides org.firebirdsql.jna.embedded.spi.FirebirdEmbeddedProvider with io.github.prrvchr.firebird_5_0_3.FirebirdEmbeddedProvider;

    requires org.firebirdsql.jna;
    requires com.sun.jna;
    requires java.base;
}