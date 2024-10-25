# CreaturePod Yocto

This is the Yocto repo for the CreaturePod project.

## Development

To initialize this repository, simply run the `./setup.sh` script. This will pull all the layers that we need.

To build the image for development (not release), run `source poky/oe-init-build-env "$PWD"/build` from here
after running the setup script. Then run `bitbake <IMAGE>`, where <IMAGE> is one of:

* creaturepod-image-console
* creaturepod-image-dev
* creaturepod-image-release

## TODO

[x] Bare bones image (boot an RPi5 image)
[x] Ensure systemd is working
[ ] Fonts
[ ] nmtui
[ ] desktop on monitor
[ ] Waveshare LCD
[ ] desktop on LCD
[ ] Touch
[ ] Camera Module
[ ] Hailo
[ ] Application dependencies
[ ] Use the Pico's I2C bus to querry the EEPROM from a CodecZero hat module and add the device tree overlay
[ ] Splashscreen
