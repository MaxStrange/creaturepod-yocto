
SUMMARY = "Python Imaging Library (Fork)"
HOMEPAGE = "None"
AUTHOR = "None <"Jeffrey A. Clark" <aclark@aclark.net>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c349a4b4b9ec2377a8fd6a7df87dbffe"

SRC_URI = "https://files.pythonhosted.org/packages/a5/26/0d95c04c868f6bdb0c447e3ee2de5564411845e36a858cfd63766bc7b563/pillow-11.0.0.tar.gz"
SRC_URI[md5sum] = "22912b3db645a51ab4b4ff036b559ca8"
SRC_URI[sha256sum] = "72bacbaf24ac003fea9bff9837d1eedb6088758d41e100c1552930151f677739"

S = "${WORKDIR}/pillow-11.0.0"

RDEPENDS_${PN} = ""

inherit setuptools
