package commands

class ListCommands {
    fun listCommands() {

        val listCommand = arrayListOf<String>();

        listCommand.add("/");
        listCommand.add("/Math");

        for (cmd in listCommand) {
            println(cmd);
        }
    }
}
