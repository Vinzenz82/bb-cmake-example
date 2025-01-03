# Recipe created by Vinzenz Petr

SECTION = "example"

# MIT
LICENSE = "MIT"
LIC_FILES_CHKSUM = ""

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = "git://github.com/Vinzenz82/bb-cmake-example;protocol=https;branch=main"
SRCREV = "7a6232be715781e394462021e3fe68b4e86f13f0"

# set package version
PV = "1.0+git${SRCPV}"

# set source dir
S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
