module academy.learnprogramming.jokeserver.programmer {
    requires academy.learnprogramming.jokeserver;
    requires java.logging;
    //exports academy.programming.jokeserver.programmer;
    provides academy.learnprogramming.jokeserver.JokeServer
            with academy.programming.jokeserver.programmer.ProgrammerJokeServer;
}