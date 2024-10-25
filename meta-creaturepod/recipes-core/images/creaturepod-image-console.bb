SUMMARY = "An image suitable for dev/debug work on the Creature Pod without a GUI. NOT suitable for release."
LICENSE = "MIT"

inherit creaturepod-image-dev

IMAGE_FEATURES += "x11"

IMAGE_INSTALL += " packagegroup-core-full-cmdline \
                 "
