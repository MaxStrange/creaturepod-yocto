DESCRIPTION = "NetworkManager along with dependencies."

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS:${PN} += " networkmanager \
                  "
