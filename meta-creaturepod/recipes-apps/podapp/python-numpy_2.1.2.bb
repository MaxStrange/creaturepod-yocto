
SUMMARY = "Fundamental package for array computing in Python"
HOMEPAGE = "https://numpy.org"
AUTHOR = "Travis E. Oliphant et al. <None>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1de863c37a83e71b1e97b64d036ea78b"

SRC_URI = "https://files.pythonhosted.org/packages/4b/d1/8a730ea07f4a37d94f9172f4ce1d81064b7a64766b460378be278952de75/numpy-2.1.2.tar.gz"
SRC_URI[md5sum] = "3d92e07d34f60dbac6b82a0982a98757"
SRC_URI[sha256sum] = "13532a088217fa624c99b843eeb54640de23b3414b14aa66d023805eb731066c"

S = "${WORKDIR}/numpy-2.1.2"

RDEPENDS_${PN} = ""

inherit setuptools
