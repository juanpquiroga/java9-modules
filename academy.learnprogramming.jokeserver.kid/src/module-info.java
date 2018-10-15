module academy.learnprogramming.jokeserver.kid {
    requires academy.learnprogramming.jokeserver;
    //exports academy.programming.jokeserver.kid;
    provides academy.learnprogramming.jokeserver.JokeServer
            with academy.programming.jokeserver.kid.KidJokeServer;
}