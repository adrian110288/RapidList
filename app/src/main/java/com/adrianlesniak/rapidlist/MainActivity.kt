package com.adrianlesniak.rapidlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val quotes = listOf(
        "Life is about making an impact, not making an income. --Kevin Kruse",
        "Whatever the mind of man can conceive and believe, it can achieve. –Napoleon Hill",
        "Strive not to be a success, but rather to be of value. –Albert Einstein",
        "Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference.  –Robert Frost",
        "I attribute my success to this: I never gave or took any excuse. –Florence Nightingale",
        "I've missed more than 9000 shots in my career. I've lost almost 300 games. 26 times I've been trusted to take the game winning shot and missed. I've failed over and over and over again in my life. And that is why I succeed. –Michael Jordan",
        "The most difficult thing is the decision to act, the rest is merely tenacity. –Amelia Earhart",
        "Every strike brings me closer to the next home run. –Babe Ruth",
        "Definiteness of purpose is the starting point of all achievement. –W. Clement Stone",
        "Your time is limited, so don’t waste it living someone else’s life. –Steve Jobs",
        "Winning isn’t everything, but wanting to win is. –Vince Lombardi",
        "I am not a product of my circumstances. I am a product of my decisions. –Stephen Covey",
        "Every child is an artist.  The problem is how to remain an artist once he grows up. –Pablo Picasso",
        "You can never cross the ocean until you have the courage to lose sight of the shore. –Christopher Columbus",
        "I’ve learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel. –Maya Angelou",
        "Either you run the day, or the day runs you. –Jim Rohn",
        "Whether you think you can or you think you can’t, you’re right. –Henry Ford",
        "The two most important days in your life are the day you are born and the day you find out why. –Mark Twain"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rapid_list.setup(
            quotes.size,
            itemBuilder = itemBuilder,
            itemBinder = itemBinder
        )
    }

    private val itemBuilder: (parent: ViewGroup, index: Int) -> RecyclerView.ViewHolder = { parent, _ ->
        QuoteItemHolder(LayoutInflater.from(this).inflate(R.layout.quote_item, parent, false))
    }

    private val itemBinder: (vh: RecyclerView.ViewHolder, index: Int) -> Unit = { vh, index ->
        (vh as QuoteItemHolder).bind(quotes[index])
    }
}
