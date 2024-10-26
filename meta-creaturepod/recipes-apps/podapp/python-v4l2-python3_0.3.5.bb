
SUMMARY = "Python bindings for the v4l2 userspace api."
HOMEPAGE = "https://pypi.org/project/v4l2-python3/"
AUTHOR = "None <None>"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "https://files.pythonhosted.org/packages/7a/d3/fa1e69c4f1902772e385660008d0b6f7108cc6de1365cc2aea680d34af2a/v4l2-python3-0.3.5.tar.gz"
SRC_URI[md5sum] = "b8f3f8070cd73b5166a0a7cbe71e908a"
SRC_URI[sha256sum] = "e7e24739c1816d64a82929b81781ada4e5640974157a39585ad2e02dfdb102fd"

S = "${WORKDIR}/v4l2-python3-0.3.5"

RDEPENDS_${PN} = ""

inherit setuptools
