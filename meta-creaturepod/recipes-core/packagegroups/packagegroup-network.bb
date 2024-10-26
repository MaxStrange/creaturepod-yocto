DESCRIPTION = "NetworkManager and nmtui."

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS:${PN} += " networkmanager \
                    networkmanager-nmtui \
                  "
