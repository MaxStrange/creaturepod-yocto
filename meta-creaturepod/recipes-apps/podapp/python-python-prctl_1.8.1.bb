
SUMMARY = "Python(ic) interface to the linux prctl syscall"
HOMEPAGE = "http://github.com/seveas/python-prctl"
AUTHOR = "Dennis Kaarsemaker <dennis@kaarsemaker.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=f1eac2a1cbd8a678228cfa8a6d138e21"

SRC_URI = "https://files.pythonhosted.org/packages/c0/99/be5393cfe9c16376b4f515d90a68b11f1840143ac1890e9008bc176cf6a6/python-prctl-1.8.1.tar.gz"
SRC_URI[md5sum] = "a9353e0cac7e4bfe15dbc9b7462dc2a1"
SRC_URI[sha256sum] = "b4ca9a25a7d4f1ace4fffd1f3a2e64ef5208fe05f929f3edd5e27081ca7e67ce"

S = "${WORKDIR}/python-prctl-1.8.1"

RDEPENDS_${PN} = ""

inherit setuptools
