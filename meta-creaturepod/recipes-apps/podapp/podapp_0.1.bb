SUMMARY = "Recipe for adding Creature Pod application."
DESCRIPTION = "Recipe for adding Creature Pod application."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Podapp is in a different repo
SRC_URI = "git://github.com/MaxStrange/creaturepod.git;protocol=https;branch=main"
SRC_URI[sha256sum] = "${CREATUREPOD_RELEASE_SHA256}"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"

# Where to keep downloaded source files
S = "${WORKDIR}/git"

# This will cause this recipe to act using the setuptools3 do_compile/do_install tasks
SETUPTOOLS_SETUP_PATH = "${S}/app"
inherit setuptools3

RDEPENDS:${PN} += " python3 \
                    python3-modules \
                  "

# TODO: Check if we can use pyproject instead of setuptools in scarthgap
do_configure:prepend() {
  rm -f ${SETUPTOOLS_SETUP_PATH}/pyproject.toml
}
