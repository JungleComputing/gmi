** Ibis GMI README **

Ibis GMI is part of Ibis, an open source Java grid software project of
the Computer Systems group of the Computer Science department of the
Faculty of Sciences at the Vrije Universiteit, Amsterdam, The Netherlands.

The Group Method Invocation (GMI) model is a generalization of Java's
Remote Method Invocation (RMI). It allows methods to be invoked either
on a single object or a group of objects, the latter possibly with
personalized parameters. Result values and exceptions can be returned
normally (as with RMI), discarded, or, when multiple results are produced,
combined into a single result. The different method invocation and reply
handling schemes can be combined orthogonally, allowing us to express a
large spectrum of communication mechanisms of which RMI and MPI-style
collective communication are special cases. With GMI, the invocation
and reply schemes can be selected for each method individually at run time.

Some example Ibis GMI applications are provided in the "examples" directory.

Ibis GMI is free software. See the file "LICENSE.txt" for copying permissions.

The users's guide in the docs directory ("docs/usersguide.pdf") explains
how to compile and run your Ibis GMI application.

The javadoc of Ibis GMI is available in "javadoc/index.html".

Ibis has its own web-site: http://www.cs.vu.nl/ibis/.  There, you can
find more Ibis documentation, papers, application sources.

The latest Ibis GMI source repository tree is accessible through SVN at
"https://gforge.cs.vu.nl/svn/ibis/gmi/trunk".  You can check it
out anonymously using the command
"svn checkout https://gforge.cs.vu.nl/svn/ibis/gmi/trunk gmi".

The file BUGS.txt contains information for filing bug reports.

** Third party libraries included with Ibis GMI **

This product includes software developed by the Apache Software
Foundation (http://www.apache.org/).

The BCEL copyright notice lives in "notices/LICENSE.bcel.txt".  The
Log4J copyright notice lives in "notices/LICENSE.log4j.txt".  The
Slf4j copyright notice lives in "notices/LICENSE.slf4j.txt".  The
Commons copyright notice lives in notices/LICENSE.apache-2.0.txt".

This product includes jstun, which is distributed with a dual license,
one of which is version 2.0 of the Apache license. It lives in
"notices/LICENSE.apache-2.0.txt".

This product includes the UPNP library from SuperBonBon Industries. Its
license lives in "notices/LICENSE.apache-2.0.txt".

This product includes the trilead SSH-2 library. Its license
lives in "notices/LICENSE.trilead.txt".

This product includes software developed by TouchGraph LLC
(http://www.touchgraph.com/). Its license lives in
"notices/LICENSE.TG.txt".
