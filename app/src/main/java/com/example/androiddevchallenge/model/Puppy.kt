/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.model

import androidx.compose.runtime.Immutable

@Immutable
data class Puppy(
    val id: Long,
    val name: String,
    val imageUrl: String,
    val age: Long,
    val detail: String = ""
)

val puppy = listOf(
    Puppy(
        id = 1L,
        name = "Tom",
        imageUrl = "https://images.unsplash.com/photo-1455103493930-a116f655b6c5?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2851&q=80",
        age = 5,
        detail = "Tom is a cute American Pit Bull Terrier, a companion and family dog breed. Originally bred to “bait” bulls, the breed evolved into all-around farm dogs, and later moved into the house to become “nanny dogs” because they were so gentle around children."
    ),
    Puppy(
        id = 2L,
        name = "Jack",
        imageUrl = "https://images.unsplash.com/photo-1510337550647-e84f83e341ca?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1789&q=80",
        age = 2,
        detail = "Jack is a cute Labrador, is a breed of retriever-gun dog from the United Kingdom that was developed from imported Canadian fishing dogs. The Labrador is one of the most popular dog breeds in a number of countries in the world, particularly in the Western world. "
    ),
    Puppy(
        id = 3L,
        name = "Cutie",
        imageUrl = "https://images.unsplash.com/photo-1453227588063-bb302b62f50b?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1500&q=80",
        age = 6,
        detail = "Cutie is a pug, The pug is a breed of dog with physically distinctive features of a wrinkly, short-muzzled face, and curled tail. The breed has a fine, glossy coat that comes in a variety of colours, most often light brown or black, and a compact, square body with well-developed muscles."
    ),
    Puppy(
        id = 4L,
        name = "Potato",
        imageUrl = "https://images.unsplash.com/photo-1517723223973-e41138b7cad6?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1502&q=80",
        age = 8,
        detail = "Potato is a Bull dog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records"
    ),
    Puppy(
        id = 5L,
        name = "Goldy",
        imageUrl = "https://images.unsplash.com/photo-1583318444357-e54d484ba7e3?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1789&q=80",
        age = 7,
        detail = "Goldy is a frenchie, The French Bulldog is a breed of domestic dog, bred to be companion dogs. The breed is the result of a cross between Toy Bulldogs imported from England, and local ratters in Paris, France, in the 1800s. They are stocky, compact dogs with a friendly, mild-mannered temperament."
    ),
    Puppy(
        id = 6L,
        name = "Rage",
        imageUrl = "https://images.unsplash.com/photo-1483744874138-9749371f38ff?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1502&q=80",
        age = 4,
        detail = "Rage is a Boxer, The Boxer is a medium to large, short-haired breed of dog, developed in Germany. The coat is smooth and tight-fitting; colors are fawn, brindled, or white, with or without white markings."
    ),
    Puppy(
        id = 7L,
        name = "Noisy",
        imageUrl = "https://images.unsplash.com/photo-1601032368421-4798615fdc60?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80",
        age = 2299,
        detail = "Noisy is a German sheaperd, The German Shepherd is a breed of medium to large-sized working dog that originated in Germany. According to the FCI, the breed's English language name is German Shepherd Dog. "
    ),
    Puppy(
        id = 8L,
        name = "Scratch",
        imageUrl = "https://images.unsplash.com/photo-1562771968-97f18eae0823?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1500&q=80",
        age = 3,
        detail = "Scratch is a Dalmation,The Dalmatian is a breed of large-sized dog, noted for its unique white coat marked with black or liver-colored spots. Originating as a hunting dog, it was also used as a carriage dog in its early days. The origins of this breed can be traced back to Croatia and its historical region of Dalmatia."
    ),
    Puppy(
        id = 9L,
        name = "Stuart",
        imageUrl = "https://images.unsplash.com/photo-1445128417616-2f8f1047bb7d?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1500&q=80",
        age = 2,
        detail = "Stuart is a Chihuahua, The Chihuahua dog breed‘s charms include their small size, big personality, and variety in coat types and colors. They’re all dog, fully capable of competing in dog sports such as agility and obedience, and are among the top ten watchdogs recommended by experts.Although these are purebred dogs, you may still find them in shelters and rescues. Remember to adopt! Don’t shop if you want to bring a dog home."
    ),
    Puppy(
        id = 10L,
        name = "Babita",
        imageUrl = "https://images.unsplash.com/photo-1580064755419-883acc42900b?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1500&q=80",
        age = 1,
        detail = "Babita is an Akita, The Akita is a large breed of dog originating from the mountainous regions of northern Japan. There are two separate varieties of Akita: a Japanese strain, commonly called Akita Inu or Japanese Akita, and an American strain, known as the Akita or American Akita."
    )
)
