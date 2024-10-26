
SUMMARY = "A simple package for fast JPEG encoding and decoding."
HOMEPAGE = "None"
AUTHOR = "None <Joachim Folz <joachim.folz@dfki.de>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4852ed54c2da1a4958415683f23c7cf0"

SRC_URI = "https://files.pythonhosted.org/packages/a8/7f/48ed799e98f96a853cf903899880632f8a96a94de895db4f98a45309c13a/simplejpeg-1.7.6.tar.gz"
SRC_URI[md5sum] = "c5e31a7e9e11226800374e299eca85d9"
SRC_URI[sha256sum] = "89ea4784eaa09edd11b0caded9c40326c4872ba9232ff1705d5b732492e7aca8"

S = "${WORKDIR}/simplejpeg-1.7.6"

RDEPENDS_${PN} = "python-numpy"

inherit setuptools
