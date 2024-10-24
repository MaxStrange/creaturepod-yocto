# CreaturePod Yocto

This is the Yocto repo for the CreaturePod project.

## Development

To initialize this repository, simply run the `./setup.sh` script. This will pull all the layers that we need.

To build the image for development (not release), run `source poky/oe-init-build-env "$PWD"/build` from here
after running the setup script. Then run `bitbake <IMAGE>`, where <IMAGE> is one of:

* core-image-base
* creaturepod-image-dev
* creaturepod-image-release
