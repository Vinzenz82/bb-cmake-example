Example Yocto/OpenEmbedded CMake and C/C++ recipe, building an executable with static linking against standard library.
Debugging with remote gdb connection to gdbserver.

Assuming:
 
- the Yocto generated Extensible SDK is installed in <your home dir>/poky_sdk or you change the path in tasks.json
- the target has the address 192.168.7.2

Workflow:

VSCode Task: devtool_build -> devool_deploy -> gdbserver_start