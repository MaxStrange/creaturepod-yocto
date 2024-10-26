
SUMMARY = "Pythonic bindings for FFmpeg's libraries."
HOMEPAGE = "https://github.com/PyAV-Org/PyAV"
AUTHOR = "Mike Boers <pyav@mikeboers.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a9c4cea4308c4521674ecd7c3255d8af"

SRC_URI = "https://files.pythonhosted.org/packages/0c/9d/486d31e76784cc0ad943f420c5e05867263b32b37e2f4b0f7f22fdc1ca3a/av-13.1.0.tar.gz"
SRC_URI[md5sum] = "d3674dba4056f523209e1190f8e044ea"
SRC_URI[sha256sum] = "d3da736c55847d8596eb8c26c60e036f193001db3bc5c10da8665622d906c17e"

S = "${WORKDIR}/av-13.1.0"

RDEPENDS_${PN} = ""

inherit setuptools
