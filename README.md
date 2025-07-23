<!--
╔════════════════════════════════════════════════════════════════════════════════════╗
║                                                                                    ║
║   Copyright (c) 2020-25 https://prrvchr.github.io                                  ║
║                                                                                    ║
║   Permission is hereby granted, free of charge, to any person obtaining            ║
║   a copy of this software and associated documentation files (the "Software"),     ║
║   to deal in the Software without restriction, including without limitation        ║
║   the rights to use, copy, modify, merge, publish, distribute, sublicense,         ║
║   and/or sell copies of the Software, and to permit persons to whom the Software   ║
║   is furnished to do so, subject to the following conditions:                      ║
║                                                                                    ║
║   The above copyright notice and this permission notice shall be included in       ║
║   all copies or substantial portions of the Software.                              ║
║                                                                                    ║
║   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,                  ║
║   EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES                  ║
║   OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.        ║
║   IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY             ║
║   CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,             ║
║   TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE       ║
║   OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.                                    ║
║                                                                                    ║
╚════════════════════════════════════════════════════════════════════════════════════╝
-->
# [![JaybirdEmbedded logo][1]][2] Documentation

**Ce [document][3] en français.**

# version [1.0.0][4]

## Introduction:

**JaybirdEmbedded** is a Java archive providing [Java SPI services][5] capable of delivering [Firebird 5.0.3 Server][6] binaries for Windows 64-bit and/or Linux 64-bit x86 architectures to the [Jaybird JDBC driver][7] using this SPI service.  
It allows the Jaybird JDBC driver to run in truly embedded mode.

Being free software I encourage you:
- To duplicate its [source code][8].
- To make changes, corrections, improvements.
- To open [issue][9] if needed.

In short, to participate in the development of this extension.  
Because it is together that we can make Free Software smarter.

___

## Requirement:

The JaybirdEmbedded archive requires Java 17 or higher to run.

___

## Use:

In order to be functional, the loading of the JaybirdEmbedded archive must be done by the classloader, or a lower-level classloader, which will load the Jaybird JDBC driver.

___

## Historical:

### What has been done for version 1.0.0:

- First of all I would like to thank [Mark Rotteveel][10] for providing me with all the information necessary to carry out this SPI service.
- Only `win32-x86-64` and `linux-x86-64` [architectures][11] are provided by the archive. If users want to see other architectures included in the archive, please make themselves known by opening an [issue][9].

### What remains to be done for version 1.0.0:

- Add new platforms...

- Anything welcome...

[1]: </img/jaybird.svg#collapse>
[2]: <https://prrvchr.github.io/JaybirdEmbedded/>
[3]: <https://prrvchr.github.io/JaybirdEmbedded/README_fr>
[4]: <https://prrvchr.github.io/JaybirdEmbedded#what-has-been-done-for-version-100>
[5]: <https://docs.oracle.com/javase/tutorial/sound/SPI-intro.html>
[6]: <https://www.firebirdsql.org/en/firebird-5-0-3>
[7]: <https://firebirdsql.org/en/jdbc-driver/>
[8]: <https://github.com/prrvchr/JaybirdEmbedded/>
[9]: <https://github.com/prrvchr/JaybirdEmbedded/issues/new>
[10]: <https://github.com/mrotteveel>
[11]: <https://github.com/java-native-access/jna/blob/master/src/com/sun/jna/Platform.java#L66>

