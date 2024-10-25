SUMMARY = "An image suitable for dev/debug work on the Creature Pod without a GUI. NOT suitable for release."
LICENSE = "MIT"

inherit creaturepod-image-base

IMAGE_FEATURES += "bash-completion-pkgs"
IMAGE_FEATURES += "debug-tweaks"
IMAGE_FEATURES += "package-management"

IMAGE_INSTALL += " vim \
                   openocd \
                   openssh \
                   packagegroup-core-full-cmdline \
                 "
