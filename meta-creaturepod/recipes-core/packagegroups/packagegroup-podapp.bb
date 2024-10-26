DESCRIPTION = "Creature Pod application and all dependencies"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS:${PN} += " python3 \
                    python3-modules \
                    python3-smbus2 \
                    python3-picamera2 \
                    podapp \
                    i2c-tools \
                  "
