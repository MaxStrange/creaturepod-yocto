SUMMARY = "The base image all the Creature Pod images are based on."
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "splash"

IMAGE_INSTALL += " packagegroup-podapp \
                   packagegroup-network \
                   expand-rootfs \
                 "
