# Recipe created by Vinzenz Petr

SECTION = "example"

# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = "git://github.com/Vinzenz82/bb-cmake-example;protocol=https;branch=main"
SRCREV = "64e88f97885a44c8617737d647aaa394ce1dc728"

# set package version
PV = "1.0+git${SRCPV}"

# set source dir
S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
