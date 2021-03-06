package com.blogspot.pdrobushevich.jline.example;

import com.blogspot.pdrobushevich.jline.command.Command;
import jline.Completor;
import jline.SimpleCompletor;

public class HelloCommand implements Command {

    @Override
    public String getName() {
        return "hello";
    }

    @Override
    public String getDescription() {
        return "Print hello <word>";
    }

    @Override
    public String execute(final String[] args) throws InterruptedException {
        return "Hello " + args[0] + "!";
    }

    @Override
    public String[] getArgs() {
        return new String[]{"world"};
    }

    @Override
    public Completor[] getArgCompletors() {
        return new Completor[]{new SimpleCompletor(new String[]{"word"})};
    }

}
