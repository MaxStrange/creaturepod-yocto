SUMMARY = "An image suitable for dev/debug work on the Creature Pod. NOT suitable for release."
LICENSE = "MIT"

inherit creaturepod-image-base

IMAGE_INSTALL += " vim \
                   openocd \
                   openssh \
                 "
