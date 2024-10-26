SUMMARY = "An image suitable for dev/debug work on the Creature Pod. NOT suitable for release."
LICENSE = "MIT"

inherit creaturepod-image-base

IMAGE_FEATURES += "bash-completion-pkgs"
IMAGE_FEATURES += "debug-tweaks"
IMAGE_FEATURES += "package-management"
IMAGE_FEATURES += "wayland"

IMAGE_INSTALL += " vim \
                   openocd \
                   openssh \
                 "
