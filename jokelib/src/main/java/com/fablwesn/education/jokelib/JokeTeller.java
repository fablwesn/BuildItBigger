/*
 * Copyright (C) 2018 Darijo Barucic, Seventoes
 *
 *  Licensed under the MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.fablwesn.education.jokelib;

import java.util.Random;

final public class JokeTeller {
    private final String[] jokes =
            {
                    "We\'ll we\'ll we\'ll...if it isn\'t autocorrect.",
                    "I just got fired from my job at the keyboard factory. They told me I wasn\'t putting in enough shifts.",
                    "How does a computer get drunk? It takes screen-shots.",
                    "A fragment walks into a bar, and the bartender asks for an ID. Fragment says, \"I don\'t have an ID.\" So the bartender says, \"Okay, I\'ll make a NullPointerException.\"",
                    "An Android app walks into a bar. Bartender asks, \"Can I get you a drink?\" The app looks disappointed and says, \"That wasn\'t my intent.\"",
                    "Your first Android app walks into a hotel and asks for a room with an upright bed. \"Why?\" asks the concierge. \"I haven\'t implemented my horizontal yet\".",
                    "Have you heard of that new band \"1023 Megabytes\"? They\'re pretty good, but they don\'t have a gig just yet.",
            };

    final public String getRandomJoke() {
        int randomIndex = new Random().nextInt(jokes.length);
        return jokes[randomIndex];
    }
}

