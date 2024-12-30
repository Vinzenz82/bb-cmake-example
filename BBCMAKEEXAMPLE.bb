SUMMARY = "Simple test application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"

SRC_URI = "file://main.cxx
           file://CMakeLists.txt \
          "

S = "${WORKDIR}"

inherit pkgconfig cmake