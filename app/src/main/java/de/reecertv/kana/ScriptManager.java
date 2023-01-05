package de.reecertv.kana;

public class ScriptManager {

    public ScriptManager() {

    }

    public String[] getHiragana(int i) {
        String[] hiChar;

        switch (i) {
            // A-O
            case 1:
                hiChar = new String[]{"あ", "a", "lol.com"};
                break;

            case 2:
                hiChar = new String[]{"い", "i", "lol.com"};
                break;

            case 3:
                hiChar = new String[]{"う", "u", "lol.com"};
                break;

            case 4:
                hiChar = new String[]{"え", "e", "lol.com"};
                break;

            case 5:
                hiChar = new String[]{"お", "o", "lol.com"};
                break;

            // K
            case 6:
                hiChar = new String[]{"か", "ka", "lol.com"};
                break;

            case 7:
                hiChar = new String[]{"き", "ki", "lol.com"};
                break;

            case 8:
                hiChar = new String[]{"く", "ku", "lol.com"};
                break;

            case 9:
                hiChar = new String[]{"け", "ke", "lol.com"};
                break;

            case 10:
                hiChar = new String[]{"こ", "ko", "lol.com"};
                break;

            // S
            case 11:
                hiChar = new String[]{"さ", "sa", "lol.com"};
                break;

            case 12:
                hiChar = new String[]{"し", "shi", "lol.com"};
                break;

            case 13:
                hiChar = new String[]{"す", "su", "lol.com"};
                break;

            case 14:
                hiChar = new String[]{"せ", "se", "lol.com"};
                break;

            case 15:
                hiChar = new String[]{"そ", "so", "lol.com"};
                break;

            // T
            case 16:
                hiChar = new String[]{"た", "ta", "lol.com"};
                break;

            case 17:
                hiChar = new String[]{"ち", "chi", "lol.com"};
                break;

            case 18:
                hiChar = new String[]{"つ", "tsu", "lol.com"};
                break;

            case 19:
                hiChar = new String[]{"て", "te", "lol.com"};
                break;

            case 20:
                hiChar = new String[]{"と", "to", "lol.com"};
                break;

            // N
            case 21:
                hiChar = new String[]{"な", "na", "lol.com"};
                break;

            case 22:
                hiChar = new String[]{"に", "ni", "lol.com"};
                break;

            case 23:
                hiChar = new String[]{"ぬ", "nu", "lol.com"};
                break;

            case 24:
                hiChar = new String[]{"ね", "ne", "lol.com"};
                break;

            case 25:
                hiChar = new String[]{"の", "no", "lol.com"};
                break;

            // H
            case 26:
                hiChar = new String[]{"は", "ha", "lol.com"};
                break;

            case 27:
                hiChar = new String[]{"ひ", "hi", "lol.com"};
                break;

            case 28:
                hiChar = new String[]{"ふ", "fu", "lol.com"};
                break;

            case 29:
                hiChar = new String[]{"へ", "he", "lol.com"};
                break;

            case 30:
                hiChar = new String[]{"ほ", "ho", "lol.com"};
                break;

            // M
            case 31:
                hiChar = new String[]{"ま", "ma", "lol.com"};
                break;

            case 32:
                hiChar = new String[]{"み", "mi", "lol.com"};
                break;

            case 33:
                hiChar = new String[]{"む", "mu", "lol.com"};
                break;

            case 34:
                hiChar = new String[]{"め", "me", "lol.com"};
                break;

            case 35:
                hiChar = new String[]{"も", "mo", "lol.com"};
                break;

            // Y
            case 36:
                hiChar = new String[]{"や", "ya", "lol.com"};
                break;

            case 37:
                hiChar = new String[]{"ゆ", "yu", "lol.com"};
                break;

            case 38:
                hiChar = new String[]{"よ", "yo", "lol.com"};
                break;

            // R
            case 39:
                hiChar = new String[]{"ら", "ra", "lol.com"};
                break;

            case 40:
                hiChar = new String[]{"り", "ri", "lol.com"};
                break;

            case 41:
                hiChar = new String[]{"る", "ru", "lol.com"};
                break;

            case 42:
                hiChar = new String[]{"れ", "re", "lol.com"};
                break;

            case 43:
                hiChar = new String[]{"ろ", "ro", "lol.com"};
                break;

            // Others
            case 44:
                hiChar = new String[]{"わ", "wa", "lol.com"};
                break;

            case 45:
                hiChar = new String[]{"を", "o / wo", "lol.com"};
                break;

            case 46:
                hiChar = new String[]{"ん", "n", "lol.com"};
                break;

            default:
                hiChar = new String[]{"", "", ""};
                break;
        }

        return hiChar;
    }

    public String[] getKatakana(int i) {
        String[] kaChar;

        switch (i) {
            // A-O
            case 1:
                kaChar = new String[]{"ア", "a", "lol.com"};
                break;

            case 2:
                kaChar = new String[]{"イ", "i", "lol.com"};
                break;

            case 3:
                kaChar = new String[]{"ウ", "u", "lol.com"};
                break;

            case 4:
                kaChar = new String[]{"エ", "e", "lol.com"};
                break;

            case 5:
                kaChar = new String[]{"オ", "o", "lol.com"};
                break;

            // K
            case 6:
                kaChar = new String[]{"カ", "ka", "lol.com"};
                break;

            case 7:
                kaChar = new String[]{"キ", "ki", "lol.com"};
                break;

            case 8:
                kaChar = new String[]{"ク", "ku", "lol.com"};
                break;

            case 9:
                kaChar = new String[]{"ケ", "ke", "lol.com"};
                break;

            case 10:
                kaChar = new String[]{"コ", "ko", "lol.com"};
                break;

            // S
            case 11:
                kaChar = new String[]{"サ", "sa", "lol.com"};
                break;

            case 12:
                kaChar = new String[]{"シ", "shi", "lol.com"};
                break;

            case 13:
                kaChar = new String[]{"ス", "su", "lol.com"};
                break;

            case 14:
                kaChar = new String[]{"セ", "se", "lol.com"};
                break;

            case 15:
                kaChar = new String[]{"ソ", "so", "lol.com"};
                break;

            // T
            case 16:
                kaChar = new String[]{"タ", "ta", "lol.com"};
                break;

            case 17:
                kaChar = new String[]{"チ", "chi", "lol.com"};
                break;

            case 18:
                kaChar = new String[]{"ツ", "tsu", "lol.com"};
                break;

            case 19:
                kaChar = new String[]{"テ", "te", "lol.com"};
                break;

            case 20:
                kaChar = new String[]{"ト", "to", "lol.com"};
                break;

            // N
            case 21:
                kaChar = new String[]{"ナ", "na", "lol.com"};
                break;

            case 22:
                kaChar = new String[]{"ニ", "ni", "lol.com"};
                break;

            case 23:
                kaChar = new String[]{"ヌ", "nu", "lol.com"};
                break;

            case 24:
                kaChar = new String[]{"ネ", "ne", "lol.com"};
                break;

            case 25:
                kaChar = new String[]{"ノ", "no", "lol.com"};
                break;

            // H
            case 26:
                kaChar = new String[]{"ハ", "ha", "lol.com"};
                break;

            case 27:
                kaChar = new String[]{"ヒ", "hi", "lol.com"};
                break;

            case 28:
                kaChar = new String[]{"フ", "fu", "lol.com"};
                break;

            case 29:
                kaChar = new String[]{"ヘ", "he", "lol.com"};
                break;

            case 30:
                kaChar = new String[]{"ホ", "ho", "lol.com"};
                break;

            // M
            case 31:
                kaChar = new String[]{"マ", "ma", "lol.com"};
                break;

            case 32:
                kaChar = new String[]{"ミ", "mi", "lol.com"};
                break;

            case 33:
                kaChar = new String[]{"ム", "mu", "lol.com"};
                break;

            case 34:
                kaChar = new String[]{"メ", "me", "lol.com"};
                break;

            case 35:
                kaChar = new String[]{"モ", "mo", "lol.com"};
                break;

            // Y
            case 36:
                kaChar = new String[]{"ヤ", "ya", "lol.com"};
                break;

            case 37:
                kaChar = new String[]{"ユ", "yu", "lol.com"};
                break;

            case 38:
                kaChar = new String[]{"ヨ", "yo", "lol.com"};
                break;

            // R
            case 39:
                kaChar = new String[]{"ラ", "ra", "lol.com"};
                break;

            case 40:
                kaChar = new String[]{"リ", "ri", "lol.com"};
                break;

            case 41:
                kaChar = new String[]{"ル", "ru", "lol.com"};
                break;

            case 42:
                kaChar = new String[]{"レ", "re", "lol.com"};
                break;

            case 43:
                kaChar = new String[]{"ロ", "ro", "lol.com"};
                break;

            // Others
            case 44:
                kaChar = new String[]{"ワ", "wa", "lol.com"};
                break;

            case 45:
                kaChar = new String[]{"ヲ", "o / wo", "lol.com"};
                break;

            case 46:
                kaChar = new String[]{"ン", "n", "lol.com"};
                break;

            default:
                kaChar = new String[]{"", "", ""};
                break;
        }

        return kaChar;
    }
}
