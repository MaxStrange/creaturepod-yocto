
SUMMARY = "The libcamera-based Python interface to Raspberry Pi cameras, based on the original Picamera library"
HOMEPAGE = "https://github.com/RaspberryPi/picamera2"
AUTHOR = "Raspberry Pi & Raspberry Pi Foundation <picamera2@raspberrypi.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6541a38108b5accb25bd55a14e76086d"

SRC_URI = "https://files.pythonhosted.org/packages/d4/dc/d2cb15ec6f7b37f0f17ed71cda9f55aed946eb50bc9cedcba374f0b8e4dd/picamera2-0.3.22.tar.gz"
SRC_URI[md5sum] = "0be552fe8db3c1229fbcd6d0731b1b5b"
SRC_URI[sha256sum] = "892869814342bbcb874bb8de7a1b605898449bf5212639f46f0daaa646d6832d"

S = "${WORKDIR}/picamera2-0.3.22"

RDEPENDS_${PN} = "python-pidng python-av python-numpy python-piexif python-pillow python-python-prctl python-python3-jsonschema python-python3-libarchive-c python-python3-tqdm python-simplejpeg python-v4l2-python3"

inherit setuptools
