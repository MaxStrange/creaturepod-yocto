SUMMARY = "Recipe for including a custom .cfg file for our MCU's connection to RPi."
DESCRIPTION = "${SUMMARY}"

# Need to add another SWD OpenOCD config file
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://raspberrypi-pico-swd.cfg \
"

# Add another raspberrypi OpenOCD config to OpenOCD's interfaces folder
do_install:append() {
    install -d ${D}/usr/share/openocd/scripts/interface
    install -m 0644 ${WORKDIR}/raspberrypi-pico-swd.cfg ${D}/usr/share/openocd/scripts/interface/raspberrypi-pico-swd.cfg
}
