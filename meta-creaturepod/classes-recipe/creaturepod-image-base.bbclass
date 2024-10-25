SUMMARY = "The base image all the Creature Pod images are based on."
LICENSE = "MIT"

inherit core-image

# Available IMAGE_FEATURES can be found in poky/meta/classes-recipe/core-image.bbclass
IMAGE_FEATURES += "splash"
IMAGE_FEATURES += "hwcodecs"

IMAGE_INSTALL += " packagegroup-podapp \
                   packagegroup-network \
                   expand-rootfs \
                 "
