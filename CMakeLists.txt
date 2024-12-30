cmake_minimum_required(VERSION 3.10)

# set the project name and version
project(BB-CMAKE-EXAMPLE VERSION 1.0)

# specify the C++ standard
set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

# Setze den C++ Compiler Pfad (angepasst für deinen Compiler)
#set(TOOLCHAIN_PREFIX /opt/poky/4.0.23/sysroots/x86_64-pokysdk-linux/usr/bin/x86_64-poky-linux/)
#set(CMAKE_C_COMPILER ${TOOLCHAIN_PREFIX}x86_64-poky-linux-gcc)
#set(CMAKE_CXX_COMPILER ${TOOLCHAIN_PREFIX}x86_64-poky-linux-g++)

#set(CMAKE_SYSROOT /opt/poky/4.0.23/sysroots/core2-64-poky-linux)

add_compile_options(-Wall -pedantic -Og -g)
add_link_options("-static")

# add the executable
add_executable(HelloWorld main.cxx)

install(TARGETS HelloWorld DESTINATION bin)