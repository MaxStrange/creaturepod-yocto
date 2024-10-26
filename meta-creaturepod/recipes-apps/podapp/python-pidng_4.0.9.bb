
SUMMARY = "Python utility for creating Adobe DNG files from RAW image data."
HOMEPAGE = "https://github.com/schoolpost/PiDNG"
AUTHOR = "Csaba Nagy <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=092f551bd6b87930ba9ba190f3633972"

SRC_URI = "https://files.pythonhosted.org/packages/c0/65/2670c465c8a63a23eb3a5e5547262e247e1aa2d3889a0a6781da9109d5f7/pidng-4.0.9.tar.gz"
SRC_URI[md5sum] = "f5fc16b830cba7c33b8cfac15fb89160"
SRC_URI[sha256sum] = "560eb008086f8a715fd9e1ab998817a7d4c8500a7f161b9ce6af5ab27501f82c"

S = "${WORKDIR}/pidng-4.0.9"

RDEPENDS_${PN} = ""

inherit setuptools
