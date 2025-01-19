cmake_minimum_required(VERSION 3.10)

# set the project name and version
project(BB-CMAKE-EXAMPLE VERSION 1.0)

# specify the C++ standard
set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

# add the executables
add_executable(HelloStaticWorld main.cxx)
add_executable(HelloDynamicWorld main.cxx)

target_compile_options(HelloStaticWorld PUBLIC
                        -Wall
                        -pedantic 
                        -Og 
                        -g
)

target_compile_options(HelloDynamicWorld PUBLIC
                        -Wall
                        -pedantic 
                        -Og 
                        -g
)

target_link_options(HelloStaticWorld PUBLIC -static)

install(TARGETS HelloStaticWorld DESTINATION bin)
install(TARGETS HelloDynamicWorld DESTINATION bin)