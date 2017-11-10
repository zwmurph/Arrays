package com.example.android.arrays;

/**
 * The Word class that creates and provides methods that return parts of the ArrayList when called
 * by other parts of the app
 */
public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Declare private variables for this class to use
     */
    private String mEnglishWord;
    private String mFrenchWord;
    private int mResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create the constructor for this class, a constructor creates an instance of a class
     * This constructor will create an instance of two Strings
     *
     * @param englishWord
     * @param frenchWord
     */
    public Word(String englishWord, String frenchWord) {
        mEnglishWord = englishWord;
        mFrenchWord = frenchWord;
    }

    /**
     * Create a second constructor for this class
     * This constructor will create an instance of two Strings and an int
     *
     * @param englishWord
     * @param frenchWord
     * @param resourceId  for Images use int as the resource ID is an int type
     */
    public Word(String englishWord, String frenchWord, int resourceId) {
        mEnglishWord = englishWord;
        mFrenchWord = frenchWord;
        mResourceId = resourceId;
    }

    /**
     * Custom method
     *
     * @return the English version of the word
     */
    public String getEnglishWord() {
        return mEnglishWord;
    }

    /**
     * Custom method
     *
     * @return the French version of the word
     */
    public String getFrenchWord() {
        return mFrenchWord;
    }

    /**
     * Custom method
     *
     * @return the resource ID of the image
     */
    public int getImageResourceId() {
        return mResourceId;
    }

    /**
     * Custom method
     *
     * @return a boolean value on whether the image has a resource ID or not
     */
    public boolean hasImage() {
        return mResourceId != NO_IMAGE_PROVIDED;
    }
}
