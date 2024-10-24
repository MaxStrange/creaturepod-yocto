SUMMARY = "Creature Pod image for releases. Same as dev, but with added security."
LICENSE = "MIT"

inherit creaturepod-image-base

# Remove debug-tweaks
# Add a non-root user as the default
# Force user to change password
# Add the user to i2c group
