FakeSMTP
========

FakeSMTP is a Free Fake SMTP Server written in Java. It is a stripped down version of [Nilhcem/FakeSMTP](https://github.com/Nilhcem/FakeSMTP). It will log all emails to one log file.

<img src="http://nilhcem.github.com/FakeSMTP/images/screenshot_mac.png" width="664" height="463" />

FakeSMTP uses SubEthaSMTP: an easy-to-use server-side SMTP library for Java.

FakeSMTP is free to use for commercial and non-commercial projects and the
source code is provided.

It is licensed under the very free BSD or GPL license, whichever you prefer.


Requirements
------------

You need Java JVM 1.8 or newer installed on your machine.

If you are on a "Unix-like" machine (Mac, GNU/Linux, BSD...), you may have
to be "root" to start the port `25`, otherwise, try another port >= `1024`.


Usage
-----

The fakeSMTP.jar is auto-executable.
If your desktop environment supports it, you can directly double click
on the .jar file.
Otherwise, run the following command:

    java -jar fakeSMTP-VERSION.jar

If you want to change the default port 25, you can use `-p` argument:

    java -jar fakeSMTP-VERSION.jar -p 2525
