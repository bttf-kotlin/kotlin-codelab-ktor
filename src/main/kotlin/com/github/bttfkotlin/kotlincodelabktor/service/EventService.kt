package com.github.bttfkotlin.kotlincodelabktor.service

import com.github.bttfkotlin.kotlincodelabktor.bean.Event


object EventService {
    fun getAllEvents(): List<Event> {
        return listOf(
                Event(
                        date = "1776",
                        title = "sign of the declaration of independance",
                        description = "you could really see it"
                ),
                Event(
                        date = "1828",
                        title = "date of birth of Jules Verne",
                        description = "Doc's favorite author"
                ),
                Event(
                        date = "1850",
                        title = "first Hill Valley archives",
                        description = "see : \"A History of Hill Valley 1850 - 1930"
                ),
                Event(
                        date = "1864",
                        title = "first edition of \"Journey to the Center of the Earth",
                        description = "Doc read it at the age of 11"
                ),
                Event(
                        date = "1869",
                        title = "first edition of \"20000 Leagues under the Sea",
                        description = "Doc's favorite novel"
                ),
                Event(
                        date = "1884",
                        title = "Tannen shot a newspaper editor",
                        description = "the later printed an unfavorable story about him"
                ),
                Event(
                        date = "1885",
                        title = "death of Clara Clayton",
                        description = "a school teacher died in the ravine which took her name"
                ),
                Event(
                        date = "",
                        title = "disappearance of Clint Eastwood",
                        description = "a young local hero disappeared in the ravine which took his name"
                ),
                Event(
                        date = "",
                        title = "death of Emmet Brown",
                        description = "he died on September 7th, before Marty comes to save him "
                ),
                Event(
                        date = "",
                        title = "Buford Tannen arrested",
                        description = "this dangerous criminal's reign is over"
                ),
                Event(
                        date = "",
                        title = "inauguration of the clock tower",
                        description = "70 years of good work"
                ),
                Event(
                        date = "1886",
                        title = "The bridge over the ravine is completed",
                        description = "scheduled completion : Summer 1886"
                ),
                Event(
                        date = "1890",
                        title = "speed record by a locomotive: 144 km/h (more than 88 mph)",
                        description = "French record, but we all know Doc and Marty were the first ones to reach 88mph in a locomotive"
                ),
                Event(
                        date = "1899",
                        title = "marketing of Aspirin",
                        description = "1885 Doc's quote : \"The thing I really miss here is Tylenol"
                ),
                Event(
                        date = "1903",
                        title = "first appearance of the brand name Texaco (replaces Texas Company)",
                        description = "maybe there were a Texaco station in Hill Valley in this early century"
                ),
                Event(
                        date = "1908",
                        title = "the Brown settle in Hill Valley",
                        description = "The last name of Doc's father was Von Braun"
                ),
                Event(
                        date = "1913",
                        title = "invention of refregirator",
                        description = "but Doc invented the icicle machine in 1885"
                ),
                Event(
                        date = "1937",
                        title = "date of birth of Biff Tannen",
                        description = "Biff is 21, in 1958, when he wins his first million dollars"
                ),
                Event(
                        date = "1938",
                        title = "date of birth of George McFly",
                        description = "his birthday is indicated on his tombstone : he was born April 1st which is quite funny"
                ),
                Event(
                        date = "",
                        title = "date of birth of Lorraine Baines",
                        description = "November 12th 1955, she tells Marty she is nearly 18"
                ),
                Event(
                        date = "1947",
                        title = "invention of transistor",
                        description = "maybe this is what miss Doc to repair the DeLorean in 1885"
                ),
                Event(
                        date = "",
                        title = "invention of frisbee",
                        description = "invented by american students out of pie plates coming from Joseph Frisbie's cake shop"
                ),
                Event(
                        date = "1948",
                        title = "invention of Polaroid",
                        description = "used by Doc and Marty in 1955"
                ),
                Event(
                        date = "1954",
                        title = "release date of \"The Cattle Queen of Montana",
                        description = "this movie is screened by the Essex in 1955. Barbara Stanwyck and Ronald Reagan plays in it"
                ),
                Event(
                        date = "1955",
                        title = "death of Albert Einstein",
                        description = "Doc always admired him"
                ),
                Event(
                        date = "",
                        title = "Clint Eastwood plays in \"Revenge of the Creature\"and \"Tarantula",
                        description = "both films are screened in 1955 at the drive-in movie theater"
                ),
                Event(
                        date = "1958",
                        title = "Biff's first million dollars",
                        description = "won at the age of 21, in the alternative Hill Valley"
                ),
                Event(
                        date = "1967",
                        title = "Clint Eastwood plays in \"A fistful of dollars\"(released in 1964 in Europe)",
                        description = "that is the movie that Biff is watching in his hot tub, in 1985A. In the scene, Clint Eastwood uses a bulletproof protection."
                ),
                Event(
                        date = "1968",
                        title = "date of birth of Marty McFly",
                        description = "in bttf1, Marty says he'll be about 47 in 2015"
                ),
                Event(
                        date = "",
                        title = "date of birth of Jennifer Parker",
                        description = "in 2015, her thumb reveles that she is 47"
                ),
                Event(
                        date = "",
                        title = "date of birth of Douglas Needles",
                        description = "in 2015, the wide screen in the den reads that Needles is 47"
                ),
                Event(
                        date = "1969",
                        title = "first steps of Man on the Moon",
                        description = "84 years to wait from 1885"
                ),
                Event(
                        date = "1973",
                        title = "death of George McFly",
                        description = "March 15th, in the alternative Hill Valley : lead poisoning"
                ),
                Event(
                        date = "",
                        title = "Biff gets married with Lorraine",
                        description = "in the alternative Hill Valley : third time's the charm !"
                ),
                Event(
                        date = "",
                        title = "date of birth of Ito Fujitsu",
                        description = "in 2015, the wide screen in the den reads that Marty's boss is 42"
                ),
                Event(
                        date = "1975",
                        title = "release date of \"Jaws",
                        description = "first appearance of the famous shark"
                ),
                Event(
                        date = "1976",
                        title = "Marty accidentally sets fire to the living room rug",
                        description = "in 1955, Marty tells his future parents to be easy on their kids if one of them, when he is 8 years old, sets fire to the living room rug"
                ),
                Event(
                        date = "1978",
                        title = "release date of \"Jaws 2",
                        description = "first sequel for the big white shark's lovers"
                ),
                Event(
                        date = "1979",
                        title = "gambling legalized by Biff",
                        description = "the video of Biff Tannen's museum tells it"
                ),
                Event(
                        date = "1981",
                        title = "the first DeLoreans come from a factory near Belfast",
                        description = "one of them will become a time machine !"
                ),
                Event(
                        date = "",
                        title = "Ronald Reagan becomes president of the USA",
                        description = "an actor has become president !"
                ),
                Event(
                        date = "1983",
                        title = "release date of \"Jaws 3",
                        description = "a new sequel : this time, people think it's the last one"
                ),
                Event(
                        date = "1985",
                        title = "first time travel",
                        description = "historical date !"
                ),
                Event(
                        date = "",
                        title = "release date of the novel \"a match made in space",
                        description = "the first novel written by the famous author George McFly is finally released"
                ),
                Event(
                        date = "",
                        title = "date of birth of Max Spielberg",
                        description = "Steven Spielberg's son who will be the director of Jaws 19"
                ),
                Event(
                        date = "1987",
                        title = "Marty's driver licence expires",
                        description = "Marty tells Doc this date to try to convince him that he comes from the future"
                ),
                Event(
                        date = "",
                        title = "release date of \"Jaws 4",
                        description = "a brand new sequel : this time, the shark takes his revenge"
                ),
                Event(
                        date = "1992",
                        title = "date of birth of Roberta Needles",
                        description = "the wide screen in the den reads that Needles' elder daughter is 23 in 2015"
                ),
                Event(
                        date = "1994",
                        title = "date of birth of Amy Needles",
                        description = "the wide screen in the den reads that Needles' younger daughter is 21 in 2015"
                ),
                Event(
                        date = "2015",
                        title = "the Cubs win the baseball championship",
                        description = "they won against Miami. Who would have thought ?"
                ),
                Event(
                        date = "",
                        title = "release date of \"Jaws 19",
                        description = "holographic version directed by Max Spielberg"
                )
        )
    }
}