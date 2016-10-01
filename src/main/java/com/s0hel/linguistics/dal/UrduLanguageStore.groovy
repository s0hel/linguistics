package com.s0hel.linguistics.dal

import com.s0hel.linguistics.model.LanguageEntry

class UrduLanguageStore extends LanguageStore {

/*
javascript code to parse all pages:
$("audio").each(function(idx, val) { var audio = $(val).find("source"); var audioSource; if (audio.length > 0) { audioSource = audio[0].src} var row = $(val).parent().parent(); var columns = $(row).find("td"); var english = $(columns[0]).find("div.Stil35").text(); english = english.trim(); var translation = $(row).find("div.Stil45").html(); if (translation) { var i1 = translation.indexOf('33">'); var i2 = translation.indexOf("</span>");  var roman = translation.substring(i1+4, i2-1).trim(); var i3 = translation.indexOf("<div>"); translation = translation.substring(0, i3).trim();  console.log('new LanguageEntry(englishTranslation: "' + english + '", nativeTranslation: "\u202B' + translation + '\u202C", romanizedTranslation: "' + roman + '", pronounciationUrl: "' + audioSource + '"),'); } })

 $("audio").each(function (idx, val) {
    var audio = $(val).find("source");
    var audioSource;
    if (audio.length > 0) {
        audioSource = audio[0].src
    }
    var row = $(val).parent().parent();
    var columns = $(row).find("td");
    var english = $(columns[0]).find("div.Stil35").text();
    english = english.trim();
    var translation = $(row).find("div.Stil45").html();
    if (translation) {
        var i1 = translation.indexOf('33">');
        var i2 = translation.indexOf("</span>");
        var roman = translation.substring(i1 + 4, i2 - 1).trim();
        var i3 = translation.indexOf("<div>");
        translation = translation.substring(0, i3).trim();
        console.log('new LanguageEntry(englishTranslation: "' + english + '", nativeTranslation: "\u202B' + translation + '\u202C", romanizedTranslation: "' + roman + '", pronounciationUrl: "' + audioSource + '"),');
    }
})
 */

    def categories = [
            people: [
                    new LanguageEntry(englishTranslation: "I", nativeTranslation: "‫‫میں‬‬", romanizedTranslation: "mein", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0003.mp3"),
                    new LanguageEntry(englishTranslation: "I and you", nativeTranslation: "‫‫میں اور تم‬‬", romanizedTranslation: "mein aur tum", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0004.mp3"),
                    new LanguageEntry(englishTranslation: "both of us", nativeTranslation: "‫‫ہم دونوں‬‬", romanizedTranslation: "hum dono", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0005.mp3"),
                    new LanguageEntry(englishTranslation: "he", nativeTranslation: "‫‫وہ‬‬", romanizedTranslation: "woh", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0006.mp3"),
                    new LanguageEntry(englishTranslation: "he and she", nativeTranslation: "‫‫وہ (مذکر) اور وہ (مؤنث)‬‬", romanizedTranslation: "woh aur woh", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0007.mp3"),
                    new LanguageEntry(englishTranslation: "they both", nativeTranslation: "‫‫وہ دونوں‬‬", romanizedTranslation: "woh dono", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0008.mp3"),
                    new LanguageEntry(englishTranslation: "the man", nativeTranslation: "‫‫مرد‬‬", romanizedTranslation: "mard", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0009.mp3"),
                    new LanguageEntry(englishTranslation: "the woman", nativeTranslation: "‫‫عورت‬‬", romanizedTranslation: "aurat", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0010.mp3"),
                    new LanguageEntry(englishTranslation: "the child", nativeTranslation: "‫‫بچہ‬‬", romanizedTranslation: "bacha", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0011.mp3"),
                    new LanguageEntry(englishTranslation: "a family", nativeTranslation: "‫‫ایک خاندان‬‬", romanizedTranslation: "aik khandaan", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0012.mp3"),
                    new LanguageEntry(englishTranslation: "my family", nativeTranslation: "‫‫میرا خاندان‬‬", romanizedTranslation: "mera khandaan", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0013.mp3"),
                    new LanguageEntry(englishTranslation: "My family is here.", nativeTranslation: "‫‫میرا خاندان یہاں ہے-‬‬", romanizedTranslation: "mera khandaan yahan hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0014.mp3"),
                    new LanguageEntry(englishTranslation: "I am here.", nativeTranslation: "‫‫میں یہاں ہوں-‬‬", romanizedTranslation: "mein yahan hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0015.mp3"),
                    new LanguageEntry(englishTranslation: "You are here.", nativeTranslation: "‫‫تم یہاں ہو-‬‬", romanizedTranslation: "tum yahan ho-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0016.mp3"),
                    new LanguageEntry(englishTranslation: "He is here and she is here.", nativeTranslation: "‫‫وہ (مذکر) یہاں ہے اور وہ (مؤنث) یہاں ہے-‬‬", romanizedTranslation: "woh yahan hai aur woh yahan hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0017.mp3"),
                    new LanguageEntry(englishTranslation: "We are here.", nativeTranslation: "‫‫ہم یہاں ہیں-‬‬", romanizedTranslation: "hum yahan hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0018.mp3"),
                    new LanguageEntry(englishTranslation: "You are here.", nativeTranslation: "‫‫تم لوگ یہاں ہو-‬‬", romanizedTranslation: "tum log yahan ho-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0019.mp3"),
                    new LanguageEntry(englishTranslation: "They are all here.", nativeTranslation: "‫‫وہ سب لوگ یہاں ہیں-‬‬", romanizedTranslation: "woh sab log yahan hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0020.mp3")
            ],
            familyMembers: [
                    new LanguageEntry(englishTranslation: "the grandfather", nativeTranslation: "‫‫دادا‬‬", romanizedTranslation: "dada", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0023.mp3"),
                    new LanguageEntry(englishTranslation: "the grandmother", nativeTranslation: "‫‫دادی‬‬", romanizedTranslation: "dadi", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0024.mp3"),
                    new LanguageEntry(englishTranslation: "he and she", nativeTranslation: "‫‫وہ (مذکر) اور وہ (مؤنث)‬‬", romanizedTranslation: "woh aur woh", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0025.mp3"),
                    new LanguageEntry(englishTranslation: "the father", nativeTranslation: "‫‫باپ‬‬", romanizedTranslation: "baap", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0026.mp3"),
                    new LanguageEntry(englishTranslation: "the mother", nativeTranslation: "‫‫ماں‬‬", romanizedTranslation: "maan", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0027.mp3"),
                    new LanguageEntry(englishTranslation: "he and she", nativeTranslation: "‫‫وہ (مذکر) اور وہ (مؤنث)‬‬", romanizedTranslation: "woh aur woh", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0028.mp3"),
                    new LanguageEntry(englishTranslation: "the son", nativeTranslation: "‫‫بیٹا‬‬", romanizedTranslation: "beta", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0029.mp3"),
                    new LanguageEntry(englishTranslation: "the daughter", nativeTranslation: "‫‫بیٹی‬‬", romanizedTranslation: "beti", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0030.mp3"),
                    new LanguageEntry(englishTranslation: "he and she", nativeTranslation: "‫‫وہ (مذکر) اور وہ (مؤنث)‬‬", romanizedTranslation: "woh aur woh", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0031.mp3"),
                    new LanguageEntry(englishTranslation: "the brother", nativeTranslation: "‫‫بھائی‬‬", romanizedTranslation: "bhay", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0032.mp3"),
                    new LanguageEntry(englishTranslation: "the sister", nativeTranslation: "‫‫بہن‬‬", romanizedTranslation: "behan", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0033.mp3"),
                    new LanguageEntry(englishTranslation: "he and she", nativeTranslation: "‫‫وہ (مذکر) اور وہ (مؤنث)‬‬", romanizedTranslation: "woh aur woh", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0034.mp3"),
                    new LanguageEntry(englishTranslation: "the uncle", nativeTranslation: "‫‫چچا‬‬", romanizedTranslation: "chacha", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0035.mp3"),
                    new LanguageEntry(englishTranslation: "the aunt", nativeTranslation: "‫‫چچی‬‬", romanizedTranslation: "chachi", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0036.mp3"),
                    new LanguageEntry(englishTranslation: "he and she", nativeTranslation: "‫‫وہ (مذکر) اور وہ (مؤنث)‬‬", romanizedTranslation: "woh aur woh", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0037.mp3"),
                    new LanguageEntry(englishTranslation: "We are a family.", nativeTranslation: "‫‫ہم ایک خاندان ہیں-‬‬", romanizedTranslation: "hum aik khandaan hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0038.mp3"),
                    new LanguageEntry(englishTranslation: "The family is not small.", nativeTranslation: "‫‫خاندان چھوٹا نہیں ہے-‬‬", romanizedTranslation: "yeh khandaan chhota nahi hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0039.mp3"),
                    new LanguageEntry(englishTranslation: "The family is big.", nativeTranslation: "‫‫خاندان بڑا ہے-‬‬", romanizedTranslation: "yeh khandaan bara hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0040.mp3")
            ],
            gettingToKnowOthers: [
                    new LanguageEntry(englishTranslation: "Hi!", nativeTranslation: "‫‫ہیلو‬‬", romanizedTranslation: "hello", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0043.mp3"),
                    new LanguageEntry(englishTranslation: "Hello!", nativeTranslation: "‫‫سلام‬‬", romanizedTranslation: "salam", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0044.mp3"),
                    new LanguageEntry(englishTranslation: "How are you?", nativeTranslation: "‫‫کیا حال ہے؟‬‬", romanizedTranslation: "kya haal hai?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0045.mp3"),
                    new LanguageEntry(englishTranslation: "Do you come from Europe?", nativeTranslation: "‫‫کیا آپ یورپ کے رہنے والے ہیں؟‬‬", romanizedTranslation: "kya aap Europe ke rehne walay hain?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0046.mp3"),
                    new LanguageEntry(englishTranslation: "Do you come from America?", nativeTranslation: "‫‫کیا آپ امریکا کے رہنے والے ہیں؟‬‬", romanizedTranslation: "kya aap America ke rehne walay hain?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0047.mp3"),
                    new LanguageEntry(englishTranslation: "Do you come from Asia?", nativeTranslation: "‫‫کیا آپ ایشیا سے ہیں؟‬‬", romanizedTranslation: "kya aap asia se hain?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0048.mp3"),
                    new LanguageEntry(englishTranslation: "In which hotel are you staying?", nativeTranslation: "‫‫آپ کس ہوٹل میں رہتے ہیں؟‬‬", romanizedTranslation: "aap kis hotel mein rehtay hain?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0049.mp3"),
                    new LanguageEntry(englishTranslation: "How long have you been here for?", nativeTranslation: "‫‫آپ یہاں کب سے ہیں؟‬‬", romanizedTranslation: "aap yahan kab se hain?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0050.mp3"),
                    new LanguageEntry(englishTranslation: "How long will you be staying?", nativeTranslation: "‫‫آپ کب تک رکیں گے؟‬‬", romanizedTranslation: "aap kab taq rkin ge?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0051.mp3"),
                    new LanguageEntry(englishTranslation: "Do you like it here?", nativeTranslation: "‫‫کیا آپ کو یہاں اچھا لگ رہا ہے؟‬‬", romanizedTranslation: "kya aap ko yahan achaa lag raha hai?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0052.mp3"),
                    new LanguageEntry(englishTranslation: "Are you here on vacation?", nativeTranslation: "‫‫کیا آپ یہاں چھٹیوں پر ہیں؟‬‬", romanizedTranslation: "kya aap yahan chudiyon par hain?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0053.mp3"),
                    new LanguageEntry(englishTranslation: "Please do visit me sometime!", nativeTranslation: "‫‫کبھی مجھ سے ملیے -‬‬", romanizedTranslation: "kabhi maliye mujh se -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0054.mp3"),
                    new LanguageEntry(englishTranslation: "Here is my address.", nativeTranslation: "‫‫یہ میرا پتہ ہے-‬‬", romanizedTranslation: "yeh mera pata hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0055.mp3"),
                    new LanguageEntry(englishTranslation: "Shall we see each other tomorrow?", nativeTranslation: "‫‫کیا ہم کل ملیں گے؟‬‬", romanizedTranslation: "kya hum kal milein ge?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0056.mp3"),
                    new LanguageEntry(englishTranslation: "I am sorry, but I already have plans.", nativeTranslation: "‫‫معا ف کیجے گا مجھے کچھ کام ہے-‬‬", romanizedTranslation: "Muan f kije ga mujhe kuch kaam hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0057.mp3"),
                    new LanguageEntry(englishTranslation: "Bye!", nativeTranslation: "‫‫خدا حافظ‬‬", romanizedTranslation: "khuda Hafiz", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0058.mp3"),
                    new LanguageEntry(englishTranslation: "Good bye!", nativeTranslation: "‫‫پھر ملیں گے / خدا حافظ‬‬", romanizedTranslation: "phir milein ge", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0059.mp3"),
                    new LanguageEntry(englishTranslation: "See you soon!", nativeTranslation: "‫‫جلد ملیں گے‬‬", romanizedTranslation: "jald milein ge", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0060.mp3")
            ],
            atSchool: [
                    new LanguageEntry(englishTranslation: "Where are we?", nativeTranslation: "‫‫ہم کہاں ہیں؟‬‬", romanizedTranslation: "hum kahan hain?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0063.mp3"),
                    new LanguageEntry(englishTranslation: "We are at school.", nativeTranslation: "‫‫ہم سکول میں ہیں-‬‬", romanizedTranslation: "hum school mein hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0064.mp3"),
                    new LanguageEntry(englishTranslation: "We are having class / a lesson.", nativeTranslation: "‫‫ہماری کلاس چل رہی ہے-‬‬", romanizedTranslation: "hamari class chal rahi hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0065.mp3"),
                    new LanguageEntry(englishTranslation: "Those are the school children.", nativeTranslation: "‫‫یہ طلبہ ہیں-‬‬", romanizedTranslation: "yeh talba hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0066.mp3"),
                    new LanguageEntry(englishTranslation: "That is the teacher.", nativeTranslation: "‫‫یہ استانی ہے-‬‬", romanizedTranslation: "yeh ustani hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0067.mp3"),
                    new LanguageEntry(englishTranslation: "That is the class.", nativeTranslation: "‫‫یہ کلاس ہے-‬‬", romanizedTranslation: "yeh class hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0068.mp3"),
                    new LanguageEntry(englishTranslation: "What are we doing?", nativeTranslation: "‫‫ہم کیا کررہے ہیں؟‬‬", romanizedTranslation: "hum kya kar rahay hain?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0069.mp3"),
                    new LanguageEntry(englishTranslation: "We are learning.", nativeTranslation: "‫‫ہم سیکھ / پڑھ رہے ہیں-‬‬", romanizedTranslation: "hum seekh rahay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0070.mp3"),
                    new LanguageEntry(englishTranslation: "We are learning a language.", nativeTranslation: "‫‫ہم ایک زبان سیکھ رہے ہیں-‬‬", romanizedTranslation: "hum aik zabaan seekh rahay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0071.mp3"),
                    new LanguageEntry(englishTranslation: "I learn English.", nativeTranslation: "‫‫میں انگریزی سیکھ رہا ہوں-‬‬", romanizedTranslation: "mein angrezi seekh raha hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0072.mp3"),
                    new LanguageEntry(englishTranslation: "You learn Spanish.", nativeTranslation: "‫‫تم اسپینش / ہسپانوی سیکھ رہے ہو-‬‬", romanizedTranslation: "tum haspanwi seekh rahay ho-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0073.mp3"),
                    new LanguageEntry(englishTranslation: "He learns German.", nativeTranslation: "‫‫وہ جرمن سیکھ رہا ہے-‬‬", romanizedTranslation: "woh german seekh raha hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0074.mp3"),
                    new LanguageEntry(englishTranslation: "We learn French.", nativeTranslation: "‫‫ہم فرانسیسی سیکھ رہے ہیں-‬‬", romanizedTranslation: "hum francesi seekh rahay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0075.mp3"),
                    new LanguageEntry(englishTranslation: "You all learn Italian.", nativeTranslation: "‫‫تم لوگ اطالوی سیکھ رہے ہو-‬‬", romanizedTranslation: "tum log atalwi seekh rahay ho-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0076.mp3"),
                    new LanguageEntry(englishTranslation: "They learn Russian.", nativeTranslation: "‫‫آپ روسی سیکھ رہے ہیں-‬‬", romanizedTranslation: "aap roosi seekh rahay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0077.mp3"),
                    new LanguageEntry(englishTranslation: "Learning languages is interesting.", nativeTranslation: "‫‫زبانوں کا سیکھنا دلچسپ ہے-‬‬", romanizedTranslation: "zabanon ka seekhna dilchasp hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0078.mp3"),
                    new LanguageEntry(englishTranslation: "We want to understand people.", nativeTranslation: "‫‫ہم لوگوں کو سمجھنا چاہتے ہیں-‬‬", romanizedTranslation: "hum logon ko samjhna chahtay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0079.mp3"),
                    new LanguageEntry(englishTranslation: "We want to speak with people.", nativeTranslation: "‫‫ہم لوگوں سے بات کرنا چاہتے ہیں-‬‬", romanizedTranslation: "hum logon se baat karna chahtay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0080.mp3")
            ],
            countriesLanguages: [
                    new LanguageEntry(englishTranslation: "John is from London.", nativeTranslation: "‫‫جون لندن کا رہنے والا ہے-‬‬", romanizedTranslation: "June London ka rehne wala hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0083.mp3"),
                    new LanguageEntry(englishTranslation: "London is in Great Britain.", nativeTranslation: "‫‫لندن برطانیہ میں ہے-‬‬", romanizedTranslation: "London Bartania mein hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0084.mp3"),
                    new LanguageEntry(englishTranslation: "He speaks English.", nativeTranslation: "‫‫وہ انگریزی بولتا ہے-‬‬", romanizedTranslation: "woh angrezi boltaa hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0085.mp3"),
                    new LanguageEntry(englishTranslation: "Maria is from Madrid.", nativeTranslation: "‫‫ماریہ میڈرڈ کی رہنے والی ہے-‬‬", romanizedTranslation: "maria midrd ki rehne wali hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0086.mp3"),
                    new LanguageEntry(englishTranslation: "Madrid is in Spain.", nativeTranslation: "‫‫میڈرڈ اسپین میں ہے-‬‬", romanizedTranslation: "midrd spain mein hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0087.mp3"),
                    new LanguageEntry(englishTranslation: "She speaks Spanish.", nativeTranslation: "‫‫وہ اسپینش / ہسپانوی بولتی ہے-‬‬", romanizedTranslation: "woh Spenish bolti hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0088.mp3"),
                    new LanguageEntry(englishTranslation: "Peter and Martha are from Berlin.", nativeTranslation: "‫‫پیٹر اور مارتھا برلن کے رہنے والے ہیں-‬‬", romanizedTranslation: "pitr aur martha Berlin ke rehne walay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0089.mp3"),
                    new LanguageEntry(englishTranslation: "Berlin is in Germany.", nativeTranslation: "‫‫برلن جرمنی میں ہے-‬‬", romanizedTranslation: "Berlin Germany mein hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0090.mp3"),
                    new LanguageEntry(englishTranslation: "Do both of you speak German?", nativeTranslation: "‫‫کیا تم دونوں جرمن بولتے ہو؟‬‬", romanizedTranslation: "kya tum dono german boltay ho?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0091.mp3"),
                    new LanguageEntry(englishTranslation: "London is a capital city.", nativeTranslation: "‫‫لندن دارلخلافہ ہے-‬‬", romanizedTranslation: "London darlkhlafh hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0092.mp3"),
                    new LanguageEntry(englishTranslation: "Madrid and Berlin are also capital cities.", nativeTranslation: "‫‫میڈرڈ اور برلن بھی دارلخلافہ ہیں-‬‬", romanizedTranslation: "midrd aur Berlin bhi darlkhlafh hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0093.mp3"),
                    new LanguageEntry(englishTranslation: "Capital cities are big and noisy.", nativeTranslation: "‫‫دارلخلافہ بڑے اور شورزدہ ہوتے ہیں-‬‬", romanizedTranslation: "darlkhlafh barray aur hotay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0094.mp3"),
                    new LanguageEntry(englishTranslation: "France is in Europe.", nativeTranslation: "‫‫فرانس یورپ میں ہے-‬‬", romanizedTranslation: "France Europe mein hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0095.mp3"),
                    new LanguageEntry(englishTranslation: "Egypt is in Africa.", nativeTranslation: "‫‫مصر افریقہ میں ہے-‬‬", romanizedTranslation: "misar Africa mein hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0096.mp3"),
                    new LanguageEntry(englishTranslation: "Japan is in Asia.", nativeTranslation: "‫‫جاپان ایشیا میں ہے-‬‬", romanizedTranslation: "Japan asia mein hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0097.mp3"),
                    new LanguageEntry(englishTranslation: "Canada is in North America.", nativeTranslation: "‫‫کینیڈا شمالی امریکا میں ہے-‬‬", romanizedTranslation: "canada shumali America mein hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0098.mp3"),
                    new LanguageEntry(englishTranslation: "Panama is in Central America.", nativeTranslation: "‫‫پاناما سینٹرل امریکا میں ہے-‬‬", romanizedTranslation: "panama central America mein hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0099.mp3"),
                    new LanguageEntry(englishTranslation: "Brazil is in South America.", nativeTranslation: "‫‫برازیل جنوبی امریکا میں ہے-‬‬", romanizedTranslation: "brazil janoobi America mein hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0100.mp3")
            ],
            readingWriting: [
                    new LanguageEntry(englishTranslation: "I read.", nativeTranslation: "‫‫میں پڑھتا ہوں-‬‬", romanizedTranslation: "mein parhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0103.mp3"),
                    new LanguageEntry(englishTranslation: "I read a letter.", nativeTranslation: "‫‫میں ایک حرف پڑھتا ہوں-‬‬", romanizedTranslation: "mein aik harf parhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0104.mp3"),
                    new LanguageEntry(englishTranslation: "I read a word.", nativeTranslation: "‫‫میں ایک لفظ پڑھتا ہوں-‬‬", romanizedTranslation: "mein aik lafz parhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0105.mp3"),
                    new LanguageEntry(englishTranslation: "I read a sentence.", nativeTranslation: "‫‫میں ایک جملہ پڑھتا ہوں-‬‬", romanizedTranslation: "mein aik jumla parhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0106.mp3"),
                    new LanguageEntry(englishTranslation: "I read a letter.", nativeTranslation: "‫‫میں ایک خط پڑھتا ہوں-‬‬", romanizedTranslation: "mein aik khat parhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0107.mp3"),
                    new LanguageEntry(englishTranslation: "I read a book.", nativeTranslation: "‫‫میں ایک کتاب پڑھتا ہوں-‬‬", romanizedTranslation: "mein aik kitaab parhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0108.mp3"),
                    new LanguageEntry(englishTranslation: "I read.", nativeTranslation: "‫‫میں پڑھتا ہوں-‬‬", romanizedTranslation: "mein parhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0109.mp3"),
                    new LanguageEntry(englishTranslation: "You read.", nativeTranslation: "‫‫تم پڑھتے ہو-‬‬", romanizedTranslation: "tum parhte ho-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0110.mp3"),
                    new LanguageEntry(englishTranslation: "He reads.", nativeTranslation: "‫‫وہ پڑھتا ہے-‬‬", romanizedTranslation: "woh parta hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0111.mp3"),
                    new LanguageEntry(englishTranslation: "I write.", nativeTranslation: "‫‫میں لکھتا ہوں-‬‬", romanizedTranslation: "mein likhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0112.mp3"),
                    new LanguageEntry(englishTranslation: "I write a letter / character.", nativeTranslation: "‫‫میں ایک حرف لکھتا ہوں-‬‬", romanizedTranslation: "mein aik harf likhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0113.mp3"),
                    new LanguageEntry(englishTranslation: "I write a word.", nativeTranslation: "‫‫میں ایک لفظ لکھتا ہوں-‬‬", romanizedTranslation: "mein aik lafz likhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0114.mp3"),
                    new LanguageEntry(englishTranslation: "I write a sentence.", nativeTranslation: "‫‫میں ایک جملہ لکھتا ہوں-‬‬", romanizedTranslation: "mein aik jumla likhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0115.mp3"),
                    new LanguageEntry(englishTranslation: "I write a letter.", nativeTranslation: "‫‫میں ایک خط لکھتا ہوں-‬‬", romanizedTranslation: "mein aik khat likhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0116.mp3"),
                    new LanguageEntry(englishTranslation: "I write a book.", nativeTranslation: "‫‫میں ایک کتاب لکھتا ہوں-‬‬", romanizedTranslation: "mein aik kitaab likhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0117.mp3"),
                    new LanguageEntry(englishTranslation: "I write.", nativeTranslation: "‫‫میں لکھتا ہوں-‬‬", romanizedTranslation: "mein likhta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0118.mp3"),
                    new LanguageEntry(englishTranslation: "You write.", nativeTranslation: "‫‫تم لکھتے ہو-‬‬", romanizedTranslation: "tum likhte ho-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0119.mp3"),
                    new LanguageEntry(englishTranslation: "He writes.", nativeTranslation: "‫‫وہ لکھتا ہے-‬‬", romanizedTranslation: "woh likhta hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0120.mp3")
            ],
            numbers: [
                    new LanguageEntry(englishTranslation: "I count:", nativeTranslation: "‫‫میں گنتا ہوں-‬‬", romanizedTranslation: "mein ginta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0123.mp3"),
                    new LanguageEntry(englishTranslation: "one, two, three", nativeTranslation: "‫‫ایک ، دو، تین‬‬", romanizedTranslation: "aik, doo, teen", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0124.mp3"),
                    new LanguageEntry(englishTranslation: "I count to three.", nativeTranslation: "‫‫میں تین تک گنتا ہوں-‬‬", romanizedTranslation: "mein teen taq ginta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0125.mp3"),
                    new LanguageEntry(englishTranslation: "I count further:", nativeTranslation: "‫‫میں مزید گنتا ہوں-‬‬", romanizedTranslation: "mein aur ginta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0126.mp3"),
                    new LanguageEntry(englishTranslation: "four, five, six,", nativeTranslation: "‫‫چار، پانچ، چھ‬‬", romanizedTranslation: "chaar, paanch, chay", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0127.mp3"),
                    new LanguageEntry(englishTranslation: "seven, eight, nine", nativeTranslation: "‫‫سات، آٹھ، نو‬‬", romanizedTranslation: "saat, aath, no", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0128.mp3"),
                    new LanguageEntry(englishTranslation: "I count.", nativeTranslation: "‫‫میں گنتا ہوں-‬‬", romanizedTranslation: "mein ginta hoon", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0129.mp3"),
                    new LanguageEntry(englishTranslation: "You count.", nativeTranslation: "‫‫تم گنتے ہو-‬‬", romanizedTranslation: "tum ginte ho-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0130.mp3"),
                    new LanguageEntry(englishTranslation: "He counts.", nativeTranslation: "‫‫وہ گنتا ہے-‬‬", romanizedTranslation: "woh ginta hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0131.mp3"),
                    new LanguageEntry(englishTranslation: "One. The first.", nativeTranslation: "‫‫ایک، پہلا‬‬", romanizedTranslation: "aik, pehla", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0132.mp3"),
                    new LanguageEntry(englishTranslation: "Two. The second.", nativeTranslation: "‫‫دو، دوسرا‬‬", romanizedTranslation: "doo, dosra", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0133.mp3"),
                    new LanguageEntry(englishTranslation: "Three. The third.", nativeTranslation: "‫‫تین، تیسرا‬‬", romanizedTranslation: "teen, teesra", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0134.mp3"),
                    new LanguageEntry(englishTranslation: "Four. The fourth.", nativeTranslation: "‫‫چار، چوتھا‬‬", romanizedTranslation: "chaar, choutha", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0135.mp3"),
                    new LanguageEntry(englishTranslation: "Five. The fifth.", nativeTranslation: "‫‫پانچ، پانچواں‬‬", romanizedTranslation: "paanch, panchawan", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0136.mp3"),
                    new LanguageEntry(englishTranslation: "Six. The sixth.", nativeTranslation: "‫‫چھ، چھٹا‬‬", romanizedTranslation: "chay, chhata", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0137.mp3"),
                    new LanguageEntry(englishTranslation: "Seven. The seventh.", nativeTranslation: "‫‫سات، ساتواں‬‬", romanizedTranslation: "saat, satwaan", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0138.mp3"),
                    new LanguageEntry(englishTranslation: "Eight. The eighth.", nativeTranslation: "‫‫آٹھ، آٹھواں‬‬", romanizedTranslation: "aath, aathwan", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0139.mp3"),
                    new LanguageEntry(englishTranslation: "Nine. The ninth.", nativeTranslation: "‫‫نو، نواں‬‬", romanizedTranslation: "no, nawan", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0140.mp3")
            ],
            time: [
                    new LanguageEntry(englishTranslation: "Excuse me!", nativeTranslation: "‫‫معاف کیجے گا-‬‬", romanizedTranslation: "maaf kije ga-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0143.mp3"),
                    new LanguageEntry(englishTranslation: "What time is it, please?", nativeTranslation: "‫‫کیا وقت ہوا ہے؟‬‬", romanizedTranslation: "kya waqt howa hai?", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0144.mp3"),
                    new LanguageEntry(englishTranslation: "Thank you very much.", nativeTranslation: "‫‫بہت بہت شکریہ-‬‬", romanizedTranslation: "bohat bohat", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0145.mp3"),
                    new LanguageEntry(englishTranslation: "It is one o’clock.", nativeTranslation: "‫‫ایک بج گیا ہے-‬‬", romanizedTranslation: "aik baj gaya hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0146.mp3"),
                    new LanguageEntry(englishTranslation: "It is two o’clock.", nativeTranslation: "‫‫دو بج گئے ہیں-‬‬", romanizedTranslation: "doo baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0147.mp3"),
                    new LanguageEntry(englishTranslation: "It is three o’clock.", nativeTranslation: "‫‫تین بج گئے ہیں-‬‬", romanizedTranslation: "teen baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0148.mp3"),
                    new LanguageEntry(englishTranslation: "It is four o’clock.", nativeTranslation: "‫‫چار بج گئے ہیں-‬‬", romanizedTranslation: "chaar baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0149.mp3"),
                    new LanguageEntry(englishTranslation: "It is five o’clock.", nativeTranslation: "‫‫پانچ بج گئے ہیں-‬‬", romanizedTranslation: "paanch baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0150.mp3"),
                    new LanguageEntry(englishTranslation: "It is six o’clock.", nativeTranslation: "‫‫چھ بج گئے ہیں-‬‬", romanizedTranslation: "chay baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0151.mp3"),
                    new LanguageEntry(englishTranslation: "It is seven o’clock.", nativeTranslation: "‫‫سات بج گئے ہیں-‬‬", romanizedTranslation: "saat baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0152.mp3"),
                    new LanguageEntry(englishTranslation: "It is eight o’clock.", nativeTranslation: "‫‫آٹھ بج گئے ہیں-‬‬", romanizedTranslation: "aath baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0153.mp3"),
                    new LanguageEntry(englishTranslation: "It is nine o’clock.", nativeTranslation: "‫‫نو بج گئے ہیں-‬‬", romanizedTranslation: "no baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0154.mp3"),
                    new LanguageEntry(englishTranslation: "It is ten o’clock.", nativeTranslation: "‫‫دس بج گئے ہیں-‬‬", romanizedTranslation: "das baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0155.mp3"),
                    new LanguageEntry(englishTranslation: "It is eleven o’clock.", nativeTranslation: "‫‫گیارہ بج گئے ہیں-‬‬", romanizedTranslation: "gayarah baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0156.mp3"),
                    new LanguageEntry(englishTranslation: "It is twelve o’clock.", nativeTranslation: "‫‫بارہ بج گئے ہیں-‬‬", romanizedTranslation: "baara baj gaye hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0157.mp3"),
                    new LanguageEntry(englishTranslation: "A minute has sixty seconds.", nativeTranslation: "‫‫ایک منٹ میں ساٹھ سیکنڈ ہوتے ہیں-‬‬", romanizedTranslation: "aik minute mein saath second hotay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0158.mp3"),
                    new LanguageEntry(englishTranslation: "An hour has sixty minutes.", nativeTranslation: "‫‫ایک گھنٹے میں ساٹھ منٹ ہوتے ہیں-‬‬", romanizedTranslation: "aik ghantay mein saath minute hotay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0159.mp3"),
                    new LanguageEntry(englishTranslation: "A day has twenty-four hours.", nativeTranslation: "‫‫ایک دن میں چوبیس گھنٹے ہوتے ہیں-‬‬", romanizedTranslation: "aik din mein chobees ghantay hotay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0160.mp3")
            ],
            daysOfWeek: [
                    new LanguageEntry(englishTranslation: "Monday", nativeTranslation: "‫‫پیر‬‬", romanizedTranslation: "paiir", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0163.mp3"),
                    new LanguageEntry(englishTranslation: "Tuesday", nativeTranslation: "‫‫منگل‬‬", romanizedTranslation: "mangal", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0164.mp3"),
                    new LanguageEntry(englishTranslation: "Wednesday", nativeTranslation: "‫‫بدھ‬‬", romanizedTranslation: "budh", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0165.mp3"),
                    new LanguageEntry(englishTranslation: "Thursday", nativeTranslation: "‫‫جمعرات‬‬", romanizedTranslation: "jumaraat", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0166.mp3"),
                    new LanguageEntry(englishTranslation: "Friday", nativeTranslation: "‫‫جمعہ‬‬", romanizedTranslation: "jummay", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0167.mp3"),
                    new LanguageEntry(englishTranslation: "Saturday", nativeTranslation: "‫‫ہفتہ‬‬", romanizedTranslation: "hafta", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0168.mp3"),
                    new LanguageEntry(englishTranslation: "Sunday", nativeTranslation: "‫‫اتوار‬‬", romanizedTranslation: "itwaar", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0169.mp3"),
                    new LanguageEntry(englishTranslation: "the week", nativeTranslation: "‫‫ہفتہ‬‬", romanizedTranslation: "hafta", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0170.mp3"),
                    new LanguageEntry(englishTranslation: "from Monday to Sunday", nativeTranslation: "‫‫پیر سے اتوار تک‬‬", romanizedTranslation: "paiir se itwaar taq", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0171.mp3"),
                    new LanguageEntry(englishTranslation: "The first day is Monday.", nativeTranslation: "‫‫پہلا دن پیر ہے-‬‬", romanizedTranslation: "pehla din paiir hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0172.mp3"),
                    new LanguageEntry(englishTranslation: "The second day is Tuesday.", nativeTranslation: "‫‫دوسرا دن منگل ہے-‬‬", romanizedTranslation: "dosra din mangal hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0173.mp3"),
                    new LanguageEntry(englishTranslation: "The third day is Wednesday.", nativeTranslation: "‫‫تیسرا دن بدھ ہے-‬‬", romanizedTranslation: "teesra din budh hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0174.mp3"),
                    new LanguageEntry(englishTranslation: "The fourth day is Thursday.", nativeTranslation: "‫‫چوتھا دن جمعرات ہے-‬‬", romanizedTranslation: "choutha din jumaraat hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0175.mp3"),
                    new LanguageEntry(englishTranslation: "The fifth day is Friday.", nativeTranslation: "‫‫پانچواں دن جمعہ ہے-‬‬", romanizedTranslation: "panchawan din jummay hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0176.mp3"),
                    new LanguageEntry(englishTranslation: "The sixth day is Saturday.", nativeTranslation: "‫‫چھٹا دن ہفتہ ہے-‬‬", romanizedTranslation: "chhata din hafta hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0177.mp3"),
                    new LanguageEntry(englishTranslation: "The seventh day is Sunday.", nativeTranslation: "‫‫ساتواں دن اتوار ہے-‬‬", romanizedTranslation: "satwaan din itwaar hai -", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0178.mp3"),
                    new LanguageEntry(englishTranslation: "The week has seven days.", nativeTranslation: "‫‫ایک ہفتہ میں سات دن ہوتے ہیں-‬‬", romanizedTranslation: "aik hafta mein saat din hotay hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0179.mp3"),
                    new LanguageEntry(englishTranslation: "We only work for five days.", nativeTranslation: "‫‫ہم صرف پانچ دن کام کرتے ہیں-‬‬", romanizedTranslation: "hum sirff paanch din kaam karte hin-", pronounciationUrl: "http://www.book2.nl/book2/UR/SOUND/0180.mp3")
            ]
    ]


    @Override
    Map<String, Map<String, LanguageEntry>> getCategoryEntryStore() {
        return null
    }

    @Override
    Map<String, LanguageEntry> getEntryStore() {
        return null
    }
}
