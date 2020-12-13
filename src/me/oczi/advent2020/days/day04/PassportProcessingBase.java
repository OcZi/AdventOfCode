package me.oczi.advent2020.days.day04;

import me.oczi.advent2020.puzzle.Puzzle;
import me.oczi.advent2020.utils.Strings;

import java.util.List;
import java.util.regex.Pattern;

public abstract class PassportProcessingBase implements Puzzle<String> {
  protected final String INPUT =
      "ecl:#eef340 eyr:2023 hcl:#c0946f pid:244684338 iyr:2020 cid:57 byr:1969 hgt:152cm\n" +
      "\n" +
      "pid:303807545 cid:213 ecl:gry hcl:#fffffd\n" +
      "eyr:2038 byr:1951\n" +
      "hgt:171cm iyr:2011\n" +
      "\n" +
      "hcl:#c0946f byr:1933 eyr:2025 pid:517067213 hgt:173cm\n" +
      "ecl:hzl\n" +
      "iyr:2018\n" +
      "\n" +
      "pid:5253256652 byr:2009 hgt:152cm iyr:1989 eyr:1968 hcl:64cb63 ecl:hzl\n" +
      "\n" +
      "iyr:2013\n" +
      "pid:862607211 eyr:2020\n" +
      "hgt:174cm\n" +
      "byr:1990\n" +
      "ecl:blu hcl:#888785\n" +
      "\n" +
      "ecl:grn byr:1955\n" +
      "pid:608098408 eyr:2027 iyr:2020 hcl:#b6652a cid:264\n" +
      "hgt:181cm\n" +
      "\n" +
      "byr:1998 ecl:hzl eyr:2021\n" +
      "hcl:#866857 hgt:189cm iyr:2030\n" +
      "pid:013735467\n" +
      "\n" +
      "pid:075417314 hcl:#b6652a byr:1957\n" +
      "iyr:2011\n" +
      "hgt:154cm\n" +
      "eyr:2025\n" +
      "ecl:amb\n" +
      "\n" +
      "iyr:1993 hgt:74cm eyr:1960\n" +
      "byr:2029\n" +
      "hcl:293244 ecl:#3cb5e5 pid:4861232363\n" +
      "\n" +
      "hgt:153cm hcl:#6b5442 pid:065240897 byr:1932\n" +
      "cid:196 ecl:blu eyr:2028 iyr:2019\n" +
      "\n" +
      "eyr:2024 ecl:amb\n" +
      "hcl:#866857 byr:1922 pid:496904942 hgt:164cm iyr:2020\n" +
      "\n" +
      "pid:847705161 byr:1951 cid:124 iyr:1991\n" +
      "eyr:2028 ecl:dne\n" +
      "hcl:6b2d28 hgt:172cm\n" +
      "\n" +
      "byr:2007 iyr:2029 ecl:hzl eyr:2026 hgt:168in\n" +
      "hcl:z\n" +
      "pid:63151612\n" +
      "\n" +
      "iyr:2027 hgt:172in\n" +
      "cid:174 byr:2014 hcl:z eyr:1921\n" +
      "ecl:grt pid:#cebdc2\n" +
      "\n" +
      "ecl:amb hcl:#d09c0f\n" +
      "iyr:2015 hgt:156cm eyr:2026 byr:1962\n" +
      "pid:086120872\n" +
      "\n" +
      "cid:125\n" +
      "pid:837849996\n" +
      "byr:1958 ecl:brn hgt:166cm hcl:#ceb3a1 eyr:2028 iyr:2012\n" +
      "\n" +
      "ecl:gry hgt:180cm\n" +
      "pid:939059935 eyr:2023 byr:1977 hcl:#b6652a\n" +
      "\n" +
      "hgt:190in byr:2029 eyr:1984\n" +
      "ecl:gry hcl:z pid:055092916 iyr:2010\n" +
      "\n" +
      "hgt:63in ecl:blu byr:1940 iyr:2012 eyr:2029 hcl:#7d3b0c\n" +
      "pid:163033394\n" +
      "\n" +
      "eyr:2040 pid:181cm\n" +
      "iyr:1928 hgt:76cm hcl:d8aafb byr:1949 cid:275 ecl:xry\n" +
      "\n" +
      "hcl:#cfa07d ecl:oth byr:1948 eyr:2021\n" +
      "pid:719690182 hgt:179cm iyr:2020\n" +
      "\n" +
      "byr:1939 cid:266\n" +
      "eyr:2026 iyr:2017 hcl:#f116d2\n" +
      "ecl:hzl pid:522421825\n" +
      "hgt:68in\n" +
      "\n" +
      "hcl:z hgt:61in\n" +
      "cid:115 pid:180cm iyr:2030 byr:2014 eyr:2032 ecl:hzl\n" +
      "\n" +
      "ecl:xry\n" +
      "eyr:2028 pid:191cm iyr:2015 hgt:150cm byr:2029\n" +
      "\n" +
      "eyr:2027\n" +
      "hcl:#a97842 pid:997937480 hgt:61in iyr:2019\n" +
      "byr:1921\n" +
      "ecl:grn\n" +
      "\n" +
      "hgt:163cm\n" +
      "pid:912318455 iyr:2016 byr:1988 ecl:brn hcl:#a97842 cid:221 eyr:2029\n" +
      "\n" +
      "cid:333 hcl:#c0946f\n" +
      "hgt:163cm iyr:2018 eyr:2027 ecl:oth\n" +
      "\n" +
      "cid:70 hcl:#c0946f\n" +
      "pid:961507902 byr:1949 ecl:grn iyr:2017 eyr:2029 hgt:69in\n" +
      "\n" +
      "hgt:169cm ecl:amb\n" +
      "iyr:2013 pid:496169901\n" +
      "byr:1943 eyr:2028 hcl:#ceb3a1\n" +
      "cid:249\n" +
      "\n" +
      "ecl:blu cid:343\n" +
      "iyr:1998 hgt:154in hcl:#efcc98 byr:1972\n" +
      "\n" +
      "pid:508213120 iyr:2012 eyr:2025 hcl:z hgt:70cm byr:1976\n" +
      "ecl:brn\n" +
      "\n" +
      "iyr:1924\n" +
      "eyr:2005\n" +
      "hcl:z\n" +
      "hgt:167 pid:154cm\n" +
      "byr:2007\n" +
      "\n" +
      "pid:761333244 hgt:180cm iyr:2017 hcl:#18171d eyr:2021\n" +
      "byr:1983\n" +
      "cid:67 ecl:oth\n" +
      "\n" +
      "eyr:1993\n" +
      "byr:2003\n" +
      "hcl:#602927\n" +
      "ecl:grt\n" +
      "cid:84 hgt:178\n" +
      "pid:1847086637 iyr:2026\n" +
      "\n" +
      "hcl:#866857 hgt:162cm pid:483774485 iyr:2010\n" +
      "byr:1946 eyr:2028 ecl:gry\n" +
      "\n" +
      "pid:726639691 eyr:2028\n" +
      "hgt:171cm hcl:#ff65a6\n" +
      "iyr:2011 byr:1989\n" +
      "\n" +
      "hcl:z iyr:2026 ecl:xry\n" +
      "eyr:2037 byr:2005 pid:#f09a0f\n" +
      "hgt:68 cid:156\n" +
      "\n" +
      "hgt:71in ecl:blu eyr:2026 hcl:#18171d\n" +
      "byr:1981 iyr:2017\n" +
      "pid:698636544\n" +
      "\n" +
      "eyr:2021\n" +
      "byr:1957 ecl:brn pid:365378126 cid:93 iyr:2019 hcl:#18171d hgt:179cm\n" +
      "\n" +
      "byr:1996 iyr:2014 hgt:64cm\n" +
      "eyr:2034\n" +
      "hcl:z\n" +
      "\n" +
      "pid:629486472 cid:140\n" +
      "hgt:192cm eyr:2020 hcl:#b6652a iyr:1988 byr:2021 ecl:brn\n" +
      "\n" +
      "byr:1955 iyr:2015 eyr:2030\n" +
      "ecl:gry hcl:z pid:6550198754\n" +
      "hgt:158cm cid:305\n" +
      "\n" +
      "ecl:gry hcl:#a97842\n" +
      "hgt:176cm eyr:2022 pid:810146585 iyr:2020\n" +
      "\n" +
      "byr:2027 hcl:#cfa07d\n" +
      "iyr:2011 ecl:#f07598\n" +
      "cid:293\n" +
      "hgt:150cm pid:#fa948d eyr:2029\n" +
      "\n" +
      "eyr:2028 iyr:2013 hgt:69in ecl:gry pid:317170371\n" +
      "cid:147 hcl:#bfe1f1\n" +
      "\n" +
      "byr:1976\n" +
      "pid:059341891 hgt:174cm\n" +
      "ecl:oth\n" +
      "eyr:2029 iyr:2017 hcl:#733820\n" +
      "\n" +
      "iyr:2018 hcl:#ceb3a1 hgt:188cm cid:308\n" +
      "pid:792826885 byr:1948 ecl:blu eyr:2028\n" +
      "\n" +
      "iyr:2017 cid:94 hcl:#95c7dc\n" +
      "pid:231757803 eyr:2022\n" +
      "byr:1992 hgt:153cm ecl:amb\n" +
      "\n" +
      "eyr:2027\n" +
      "iyr:2011 hgt:186cm\n" +
      "ecl:brn pid:996347346 hcl:#866857\n" +
      "byr:1960\n" +
      "\n" +
      "eyr:2025 byr:2001\n" +
      "ecl:blu pid:755715478 iyr:2019 hgt:61in\n" +
      "\n" +
      "ecl:gry\n" +
      "eyr:2038\n" +
      "hgt:81 hcl:z iyr:2028\n" +
      "cid:214 byr:1965\n" +
      "\n" +
      "pid:412744447 byr:1979 hcl:#cfa07d ecl:blu\n" +
      "eyr:2029 cid:157\n" +
      "hgt:180in iyr:1948\n" +
      "\n" +
      "hgt:170cm\n" +
      "pid:623557081 byr:1924 eyr:2024 hcl:98d623 iyr:2012 ecl:amb\n" +
      "\n" +
      "cid:311 ecl:grn\n" +
      "iyr:2011 byr:1982\n" +
      "eyr:2002 hcl:#ef318a\n" +
      "pid:0548169957\n" +
      "hgt:87\n" +
      "\n" +
      "eyr:2030 hcl:#733820 iyr:2016 pid:558470391\n" +
      "byr:1936 ecl:oth hgt:185cm\n" +
      "\n" +
      "iyr:2019\n" +
      "ecl:amb byr:1949\n" +
      "pid:376468392\n" +
      "hgt:178cm\n" +
      "\n" +
      "pid:019195245\n" +
      "ecl:grn hgt:171cm\n" +
      "byr:1978 iyr:2011 eyr:2022 hcl:#733820\n" +
      "cid:134\n" +
      "\n" +
      "hcl:#623a2f hgt:192cm eyr:2026 byr:1977\n" +
      "ecl:grn cid:308\n" +
      "\n" +
      "ecl:hzl pid:715816358 hgt:69in iyr:2014 hcl:#623a2f\n" +
      "byr:1996\n" +
      "eyr:2027\n" +
      "\n" +
      "iyr:1947\n" +
      "ecl:#39a697\n" +
      "hgt:183cm byr:2029\n" +
      "eyr:2022 pid:7951883913\n" +
      "hcl:z\n" +
      "\n" +
      "ecl:gry byr:1950\n" +
      "hcl:#18171d hgt:168cm iyr:2020 pid:677187333 eyr:2027\n" +
      "\n" +
      "byr:1969 ecl:blu hcl:#18171d iyr:2011\n" +
      "hgt:162cm\n" +
      "pid:701349891\n" +
      "\n" +
      "cid:269 byr:1966\n" +
      "iyr:2011\n" +
      "pid:905940527 eyr:2023 hgt:190cm\n" +
      "ecl:brn hcl:#ceb3a1\n" +
      "\n" +
      "eyr:2027 pid:454627395 ecl:brn\n" +
      "hcl:#ceb3a1 cid:302 hgt:184cm\n" +
      "byr:1959\n" +
      "iyr:2015\n" +
      "\n" +
      "iyr:2011\n" +
      "eyr:2028\n" +
      "hgt:166cm\n" +
      "hcl:#733820 byr:1938 ecl:blu pid:857984986\n" +
      "\n" +
      "hcl:#c0946f ecl:brn pid:226877822\n" +
      "hgt:182cm byr:1998\n" +
      "cid:160\n" +
      "\n" +
      "hgt:186in pid:26499164 byr:2017\n" +
      "hcl:z\n" +
      "iyr:1998 eyr:2026\n" +
      "cid:331 ecl:#236556\n" +
      "\n" +
      "pid:328866543\n" +
      "hgt:165cm eyr:2039 iyr:1987 ecl:amb byr:2018 hcl:z\n" +
      "\n" +
      "iyr:2016 eyr:2036 hcl:#888785 byr:1976 pid:160402352 hgt:76cm ecl:blu\n" +
      "\n" +
      "ecl:blu\n" +
      "hcl:#fffffd eyr:2025 hgt:66in pid:979788527\n" +
      "byr:1957 iyr:2013\n" +
      "\n" +
      "ecl:grn pid:279357265 iyr:2019 eyr:2021 byr:1953\n" +
      "hgt:177cm hcl:#c0946f\n" +
      "\n" +
      "ecl:oth hcl:z eyr:2025 byr:1949 hgt:189cm iyr:2020 pid:901383503\n" +
      "\n" +
      "byr:2019 hcl:#733820\n" +
      "pid:31022828 eyr:1929\n" +
      "hgt:75cm iyr:2012 ecl:grn\n" +
      "\n" +
      "pid:080462937\n" +
      "ecl:blu hcl:#866857\n" +
      "cid:102\n" +
      "iyr:2013 eyr:2025 byr:1975 hgt:64in\n" +
      "\n" +
      "iyr:2016\n" +
      "eyr:2028\n" +
      "cid:125\n" +
      "byr:1979 hcl:#866857\n" +
      "ecl:brn hgt:173cm pid:814947616\n" +
      "\n" +
      "hcl:z byr:2020 pid:#c3b54b hgt:174in eyr:2038\n" +
      "iyr:2016\n" +
      "ecl:gmt\n" +
      "\n" +
      "cid:132\n" +
      "iyr:1958\n" +
      "pid:61543452 hcl:z\n" +
      "ecl:zzz eyr:2039 byr:2006\n" +
      "\n" +
      "cid:55 eyr:2022 byr:1954 iyr:2015\n" +
      "hgt:188cm hcl:#a97842 pid:49143631 ecl:amb\n" +
      "\n" +
      "hgt:152cm\n" +
      "byr:1982\n" +
      "iyr:2013 ecl:blu\n" +
      "hcl:#341e13\n" +
      "eyr:2026 pid:440841976\n" +
      "\n" +
      "iyr:2019 ecl:blu pid:553456616 hcl:#733820 hgt:160cm byr:1932 eyr:2030\n" +
      "\n" +
      "byr:1980 hgt:169cm hcl:#7d3b0c cid:312 iyr:2010\n" +
      "eyr:2026 pid:028550304 ecl:grn\n" +
      "\n" +
      "ecl:amb eyr:2021 iyr:2014 hgt:71in pid:986053283 byr:1981\n" +
      "\n" +
      "ecl:oth\n" +
      "eyr:2023 hcl:#888785\n" +
      "byr:1949\n" +
      "iyr:2016 pid:699325656\n" +
      "\n" +
      "hgt:63cm cid:297 eyr:2020 pid:990390922\n" +
      "hcl:#602927 ecl:lzr\n" +
      "iyr:2012 byr:2016\n" +
      "\n" +
      "hcl:9ea2fa eyr:2023 pid:088680493\n" +
      "byr:1998 iyr:2017 ecl:utc hgt:170cm cid:175\n" +
      "\n" +
      "cid:316 iyr:2016 eyr:2026 hcl:#79ff1d hgt:65in\n" +
      "byr:1997 pid:215466710 ecl:oth\n" +
      "\n" +
      "cid:213 byr:1983 hcl:#888785 iyr:2016 pid:767747981 eyr:2025\n" +
      "ecl:hzl hgt:168cm\n" +
      "\n" +
      "eyr:2030 byr:1972\n" +
      "cid:282\n" +
      "ecl:gry hgt:178cm\n" +
      "hcl:#a97842\n" +
      "iyr:2018\n" +
      "\n" +
      "hcl:#6b5442 ecl:amb\n" +
      "eyr:2028 cid:104 hgt:159cm pid:446429120 iyr:2012\n" +
      "byr:1938\n" +
      "\n" +
      "byr:1940 hgt:178cm ecl:oth\n" +
      "hcl:#ceb3a1\n" +
      "pid:845683663 iyr:2015 eyr:2024\n" +
      "\n" +
      "byr:1940 pid:496262233\n" +
      "hgt:184cm hcl:#b6652a\n" +
      "ecl:grn cid:152 iyr:2012 eyr:2029\n" +
      "\n" +
      "hgt:185cm pid:455744229 byr:1954 eyr:2022 ecl:gry hcl:#6b5442 iyr:2012\n" +
      "\n" +
      "hgt:182cm byr:1966 eyr:2028 ecl:#a5b7fc\n" +
      "iyr:2029\n" +
      "\n" +
      "pid:343591896\n" +
      "cid:58\n" +
      "ecl:hzl\n" +
      "eyr:2022 hgt:180in byr:2021\n" +
      "hcl:#6b5442\n" +
      "\n" +
      "ecl:utc hcl:#b6652a\n" +
      "pid:635147657 byr:2020\n" +
      "eyr:2022 hgt:157cm iyr:2018\n" +
      "\n" +
      "ecl:grt cid:312 iyr:1959 pid:154262836\n" +
      "hgt:171cm\n" +
      "hcl:#fffffd\n" +
      "eyr:2024\n" +
      "byr:1982\n" +
      "\n" +
      "hcl:#7a12b4 pid:223424149 ecl:hzl hgt:175cm\n" +
      "byr:1930 iyr:2010 eyr:2028\n" +
      "\n" +
      "hcl:#c0946f pid:633476454 eyr:2026 iyr:2011\n" +
      "byr:1934\n" +
      "hgt:186cm\n" +
      "cid:289 ecl:gry\n" +
      "\n" +
      "hcl:#fffffd pid:376300524 hgt:155cm byr:1964 iyr:2017 eyr:2021 ecl:grn\n" +
      "\n" +
      "hcl:a5d4dc byr:2006 cid:165 ecl:#db800f iyr:2029 pid:0199789970 eyr:1961 hgt:61cm\n" +
      "\n" +
      "eyr:2027 hgt:170cm iyr:2010\n" +
      "hcl:#c0946f\n" +
      "ecl:grn pid:415726530\n" +
      "byr:1985\n" +
      "\n" +
      "cid:197 byr:1957 hgt:192in hcl:#a97842 ecl:hzl eyr:2029 pid:958973455 iyr:2011\n" +
      "\n" +
      "iyr:2015 pid:933689314 hgt:162cm ecl:amb\n" +
      "cid:122 eyr:2021\n" +
      "hcl:#6b5442 byr:1973\n" +
      "\n" +
      "eyr:2026 hgt:172cm\n" +
      "iyr:2012\n" +
      "ecl:brn hcl:#733820 pid:004474632\n" +
      "byr:2000\n" +
      "\n" +
      "hgt:191cm eyr:2030 byr:1999 pid:9155071477 iyr:2026 hcl:#602927 cid:315\n" +
      "ecl:grn\n" +
      "\n" +
      "iyr:2010 pid:182884251 hcl:#18171d hgt:154cm\n" +
      "eyr:2020\n" +
      "byr:1926 ecl:oth\n" +
      "\n" +
      "iyr:2019 eyr:1920 pid:132839546\n" +
      "cid:283 hgt:188in hcl:#efcc98 byr:2027\n" +
      "\n" +
      "iyr:2011 hgt:177cm\n" +
      "cid:117 byr:1976\n" +
      "ecl:gry\n" +
      "hcl:#623a2f eyr:2030 pid:134592046\n" +
      "\n" +
      "byr:1968 hgt:146\n" +
      "iyr:2013 hcl:eefdc4 eyr:2028\n" +
      "ecl:xry pid:722120008\n" +
      "\n" +
      "iyr:2016 byr:1941 hgt:67cm cid:51 hcl:#b6652a ecl:hzl eyr:2034 pid:994005715\n" +
      "\n" +
      "hcl:#cfa07d ecl:oth\n" +
      "hgt:182cm eyr:2021 pid:612583941\n" +
      "byr:1983\n" +
      "iyr:2019\n" +
      "\n" +
      "byr:1922\n" +
      "hcl:#602927 hgt:161cm ecl:gry eyr:2020 pid:190170808 iyr:2013\n" +
      "\n" +
      "hgt:63cm cid:136\n" +
      "iyr:1999\n" +
      "pid:8235748647 hcl:z\n" +
      "byr:2022 eyr:1933\n" +
      "ecl:#304383\n" +
      "\n" +
      "cid:273 ecl:blu hcl:z\n" +
      "iyr:2011 byr:2007\n" +
      "eyr:2020\n" +
      "pid:942473857 hgt:178in\n" +
      "\n" +
      "ecl:grt byr:2029 hgt:187in eyr:2030 cid:160\n" +
      "hcl:#efcc98 pid:#39f22b\n" +
      "iyr:1966\n" +
      "\n" +
      "byr:1978 ecl:oth iyr:2011 hgt:164cm eyr:2027 hcl:#cfa07d\n" +
      "\n" +
      "hgt:75cm hcl:#1e8137 byr:1986 ecl:blu eyr:2022 pid:796688423\n" +
      "iyr:2012\n" +
      "\n" +
      "eyr:2026\n" +
      "ecl:#3013af hcl:z pid:#e8597f hgt:123 iyr:2025 byr:1942\n" +
      "\n" +
      "hcl:z hgt:177in\n" +
      "iyr:1993 pid:#4c9348 byr:2008 eyr:1989\n" +
      "\n" +
      "pid:123524366 byr:1935\n" +
      "hgt:156cm hcl:#7d3b0c\n" +
      "iyr:2020 ecl:brn eyr:2020\n" +
      "\n" +
      "hcl:z eyr:2038 pid:7663741757 ecl:gmt hgt:174\n" +
      "byr:2008 iyr:1939\n" +
      "cid:225\n" +
      "\n" +
      "hcl:#888785 hgt:172cm\n" +
      "ecl:oth pid:500711541 eyr:2027\n" +
      "byr:1931 iyr:2012\n" +
      "\n" +
      "pid:575447108 ecl:amb byr:1943\n" +
      "hcl:#888785 hgt:173cm eyr:2024\n" +
      "\n" +
      "eyr:2021 iyr:2010 pid:178773264 hgt:157cm byr:1965 hcl:#bb7bcf ecl:amb\n" +
      "\n" +
      "iyr:2023 ecl:#35bd84 byr:2020\n" +
      "hgt:72in\n" +
      "eyr:2037\n" +
      "hcl:#6b5442\n" +
      "pid:421311669\n" +
      "\n" +
      "byr:1921 iyr:2011\n" +
      "pid:146088688\n" +
      "eyr:2023 hcl:#15ed24 hgt:183cm\n" +
      "ecl:brn\n" +
      "\n" +
      "hcl:#b6652a cid:243\n" +
      "byr:1993 eyr:2024\n" +
      "iyr:2014 hgt:172cm\n" +
      "pid:771275594\n" +
      "\n" +
      "eyr:2024\n" +
      "hcl:#cfa07d pid:858807920 cid:293 hgt:157cm ecl:hzl iyr:2013 byr:1984\n" +
      "\n" +
      "ecl:blu hgt:193cm cid:73 hcl:#18171d eyr:2026\n" +
      "iyr:2016 pid:124151812 byr:1945\n" +
      "\n" +
      "ecl:amb iyr:2018\n" +
      "pid:214555737 hgt:157cm\n" +
      "eyr:2028\n" +
      "byr:1925 hcl:#866857\n" +
      "\n" +
      "pid:5633250409\n" +
      "hcl:4ef7d8\n" +
      "byr:2004 iyr:1958\n" +
      "hgt:96\n" +
      "eyr:2038 ecl:xry cid:274\n" +
      "\n" +
      "byr:1972 pid:401239851 hgt:184in hcl:z iyr:2017\n" +
      "eyr:2030 ecl:#cb289a cid:140\n" +
      "\n" +
      "hgt:175cm\n" +
      "byr:1926 hcl:#cfa07d eyr:2029 ecl:gry pid:325039730 iyr:2017\n" +
      "\n" +
      "cid:101 hgt:166cm byr:1986 ecl:amb\n" +
      "hcl:#7d3b0c iyr:2013\n" +
      "pid:413769688 eyr:2024\n" +
      "\n" +
      "hgt:159cm cid:311\n" +
      "byr:1993 eyr:2028 pid:188cm ecl:oth hcl:#602927 iyr:2013\n" +
      "\n" +
      "pid:565831038\n" +
      "ecl:amb\n" +
      "hgt:155cm hcl:#fffffd cid:335 iyr:2016\n" +
      "eyr:2029 byr:1997\n" +
      "\n" +
      "hgt:122\n" +
      "byr:2022\n" +
      "eyr:2028 ecl:blu iyr:2017 pid:269710626 hcl:#b6652a\n" +
      "\n" +
      "cid:196\n" +
      "byr:1953 hcl:#6b5442 iyr:2010\n" +
      "pid:216121215 hgt:188cm ecl:blu\n" +
      "\n" +
      "iyr:2011 hcl:98166c hgt:62cm\n" +
      "byr:2028\n" +
      "eyr:2024\n" +
      "pid:792478385 ecl:grn\n" +
      "\n" +
      "hcl:#efcc98 iyr:2012 pid:020039675 eyr:2021 byr:1974 hgt:156cm\n" +
      "ecl:hzl\n" +
      "\n" +
      "cid:123 hcl:#7d3b0c\n" +
      "byr:2026 eyr:2004 iyr:2012 ecl:oth pid:349203133 hgt:160cm\n" +
      "\n" +
      "pid:085461475\n" +
      "byr:1962 iyr:2020 hcl:#623a2f\n" +
      "eyr:2024\n" +
      "cid:80 ecl:brn\n" +
      "hgt:154cm\n" +
      "\n" +
      "ecl:oth hgt:156cm iyr:2016\n" +
      "hcl:#6b5442\n" +
      "byr:1973\n" +
      "eyr:2021 pid:539898580\n" +
      "\n" +
      "iyr:2026 hgt:191cm\n" +
      "hcl:z\n" +
      "byr:1930 pid:#abc2f0 ecl:blu cid:242 eyr:2024\n" +
      "\n" +
      "cid:167\n" +
      "hgt:179cm\n" +
      "iyr:2017 eyr:2021 pid:756797571 byr:1949 ecl:brn hcl:#a97842\n" +
      "\n" +
      "byr:1975 eyr:2030\n" +
      "ecl:oth hgt:169in pid:4031206183 hcl:#733820 iyr:2017 cid:244\n" +
      "\n" +
      "ecl:#54cfeb hgt:152cm\n" +
      "iyr:2026 hcl:36b4b9\n" +
      "byr:2030\n" +
      "pid:#fa1cb9 eyr:1964\n" +
      "\n" +
      "byr:1974 cid:99 hcl:9e3296\n" +
      "eyr:2032\n" +
      "pid:686747414\n" +
      "iyr:1995\n" +
      "ecl:amb\n" +
      "\n" +
      "iyr:2030 ecl:oth hcl:z byr:1979\n" +
      "pid:114661006 hgt:191cm eyr:1941\n" +
      "\n" +
      "hcl:#341e13 iyr:2014 byr:1953\n" +
      "pid:188326193 ecl:gry hgt:189cm cid:283\n" +
      "eyr:2030\n" +
      "\n" +
      "byr:1975\n" +
      "pid:092061576 hgt:73in eyr:2023\n" +
      "ecl:brn cid:227 hcl:#5e9d91\n" +
      "iyr:2011\n" +
      "\n" +
      "hcl:#7d3b0c hgt:167cm cid:141\n" +
      "eyr:1957 byr:2012 ecl:gmt iyr:2019 pid:#1b7c8a\n" +
      "\n" +
      "hgt:168cm hcl:#c0946f pid:599500784 byr:1930 eyr:2023 ecl:hzl cid:113\n" +
      "iyr:2013\n" +
      "\n" +
      "eyr:2030 hcl:#b4cb4f\n" +
      "hgt:68in\n" +
      "ecl:brn byr:1923 pid:699162086\n" +
      "\n" +
      "iyr:2013\n" +
      "ecl:dne hcl:z eyr:1971\n" +
      "pid:#580add byr:2020\n" +
      "hgt:190cm\n" +
      "\n" +
      "hcl:#ceb3a1\n" +
      "byr:1976 eyr:2020\n" +
      "cid:162 iyr:2016\n" +
      "hgt:168cm\n" +
      "ecl:hzl\n" +
      "\n" +
      "pid:050478613 hgt:59cm\n" +
      "iyr:2017\n" +
      "ecl:grn byr:2030 hcl:#cfa07d eyr:2025\n" +
      "\n" +
      "pid:352943968 eyr:2025 byr:1980 iyr:2014 ecl:gry hcl:#c0946f\n" +
      "hgt:193cm\n" +
      "\n" +
      "pid:328621931 cid:310 hgt:170cm\n" +
      "hcl:#733820 byr:1955\n" +
      "iyr:2016\n" +
      "eyr:2028 ecl:hzl\n" +
      "\n" +
      "hcl:#866857\n" +
      "pid:095858739 byr:1956\n" +
      "iyr:2018 hgt:193cm\n" +
      "ecl:hzl\n" +
      "eyr:2029\n" +
      "\n" +
      "pid:70973661 eyr:2039 ecl:gry\n" +
      "iyr:2016\n" +
      "cid:291\n" +
      "hcl:#623a2f hgt:97\n" +
      "\n" +
      "hcl:4d51a8\n" +
      "eyr:1978\n" +
      "ecl:gmt\n" +
      "byr:2029 iyr:2022\n" +
      "pid:34507041 hgt:61cm\n" +
      "\n" +
      "byr:1989 ecl:brn pid:769582914\n" +
      "eyr:2026 cid:218\n" +
      "iyr:2020 hcl:#866857 hgt:184cm\n" +
      "\n" +
      "ecl:brn\n" +
      "iyr:1998 cid:227\n" +
      "hgt:162in\n" +
      "byr:2026\n" +
      "hcl:#602927 eyr:2027 pid:236998728\n" +
      "\n" +
      "ecl:gry byr:1984 hgt:157 cid:295\n" +
      "eyr:2020\n" +
      "iyr:2018 hcl:#733820\n" +
      "pid:037871534\n" +
      "\n" +
      "hgt:166cm hcl:#c0946f pid:412146401\n" +
      "iyr:2011\n" +
      "eyr:2022\n" +
      "byr:1938\n" +
      "ecl:brn\n" +
      "\n" +
      "ecl:brn cid:95 byr:1981 eyr:2030 hcl:#efcc98 pid:777041035 hgt:152cm iyr:2011\n" +
      "\n" +
      "eyr:2024 hgt:89 pid:3761913749 iyr:1939 byr:1967 hcl:a222f6 cid:165 ecl:#7fe574\n" +
      "\n" +
      "cid:339 hgt:156cm\n" +
      "ecl:brn iyr:2013 byr:1951 hcl:#efcc98 eyr:2026\n" +
      "pid:863566946\n" +
      "\n" +
      "ecl:brn hcl:#6b5442 eyr:2023\n" +
      "pid:787129723 byr:1949 iyr:2015\n" +
      "\n" +
      "pid:#7f615a\n" +
      "cid:202 hcl:#6b5442 eyr:2028\n" +
      "ecl:#a5419c\n" +
      "hgt:75cm\n" +
      "iyr:2011\n" +
      "byr:2001\n" +
      "\n" +
      "pid:864001133\n" +
      "cid:236\n" +
      "byr:1943 hcl:#733820 ecl:dne eyr:2025 hgt:171cm iyr:1989\n" +
      "\n" +
      "pid:193073684 ecl:grn byr:1962 iyr:2014\n" +
      "hcl:#cfa07d hgt:189cm\n" +
      "cid:321 eyr:2029\n" +
      "\n" +
      "byr:1959\n" +
      "hcl:#b6652a\n" +
      "eyr:2026\n" +
      "hgt:159cm pid:815014918 iyr:2011 ecl:amb\n" +
      "\n" +
      "iyr:2017 hgt:182cm\n" +
      "hcl:#a97842 eyr:2023 ecl:grn pid:656177536\n" +
      "byr:1973\n" +
      "\n" +
      "eyr:1923 ecl:grn\n" +
      "cid:138 iyr:2020\n" +
      "hgt:164cm byr:1958 hcl:#c0946f pid:783366277\n" +
      "\n" +
      "iyr:1932 hgt:172 ecl:blu\n" +
      "hcl:#733820 byr:1962 pid:554221464\n" +
      "\n" +
      "cid:169 pid:922622614\n" +
      "byr:1942 hcl:#ceb3a1 hgt:169cm eyr:2024\n" +
      "ecl:gry iyr:2017\n" +
      "\n" +
      "cid:219 ecl:grn\n" +
      "hgt:156cm byr:1998 eyr:2021\n" +
      "iyr:2017 hcl:#ceb3a1 pid:450186263\n" +
      "\n" +
      "ecl:amb hgt:179cm pid:768428582 iyr:2010 eyr:2023 byr:1952 hcl:#fffffd\n" +
      "\n" +
      "eyr:2024\n" +
      "hgt:193cm\n" +
      "iyr:2017 pid:469033795 byr:1979 hcl:#18171d cid:67 ecl:amb\n" +
      "\n" +
      "iyr:2016 byr:1937 pid:798267514 hgt:155cm hcl:#866857 eyr:2026\n" +
      "ecl:oth\n" +
      "\n" +
      "hgt:172cm hcl:#866857 iyr:2018 pid:662186551\n" +
      "byr:1996\n" +
      "eyr:2025 ecl:amb\n" +
      "\n" +
      "pid:2854521962\n" +
      "iyr:2021\n" +
      "ecl:zzz\n" +
      "hcl:12f1ba eyr:2037 hgt:159cm\n" +
      "byr:1937\n" +
      "\n" +
      "ecl:oth pid:488050418 byr:1927 hcl:#a97842 hgt:153cm iyr:2013 eyr:2024\n" +
      "\n" +
      "pid:119536312 ecl:#2036ad\n" +
      "hcl:543178 iyr:2020\n" +
      "byr:2013\n" +
      "hgt:177cm\n" +
      "eyr:2022\n" +
      "\n" +
      "pid:788908662 hcl:#602927 eyr:2029\n" +
      "ecl:oth byr:1930\n" +
      "iyr:2020\n" +
      "hgt:179cm\n" +
      "\n" +
      "byr:1972\n" +
      "pid:053386972 iyr:2014 ecl:grn hgt:65in hcl:#cfa07d\n" +
      "\n" +
      "pid:9828921035 ecl:blu\n" +
      "hcl:z hgt:152in\n" +
      "eyr:1949 byr:2010\n" +
      "\n" +
      "cid:157 pid:097910554 byr:1999\n" +
      "hgt:159cm hcl:#6b5442 ecl:blu eyr:2024\n" +
      "iyr:2010\n" +
      "\n" +
      "hcl:#a97842\n" +
      "eyr:2040 ecl:#f8ad77\n" +
      "hgt:173cm\n" +
      "byr:2019 iyr:2010\n" +
      "pid:#d16a6e\n" +
      "\n" +
      "ecl:dne hgt:191cm iyr:2020 hcl:#b6652a\n" +
      "eyr:2021 pid:571971509 byr:1983\n" +
      "\n" +
      "hcl:#18171d iyr:2016 pid:159074622\n" +
      "eyr:2027 hgt:163cm byr:1954\n" +
      "cid:257\n" +
      "\n" +
      "pid:243560302 cid:58\n" +
      "hcl:53a4cf byr:2012\n" +
      "ecl:#fdbfb8 eyr:1920 hgt:179 iyr:2026\n" +
      "\n" +
      "pid:040606106 eyr:2030 hgt:188cm\n" +
      "byr:1969\n" +
      "iyr:2012 hcl:#ceb3a1 ecl:amb\n" +
      "\n" +
      "eyr:2022\n" +
      "hgt:175cm hcl:#b6652a byr:1967 pid:269969031\n" +
      "iyr:2018\n" +
      "\n" +
      "hcl:#18171d cid:278 byr:1931\n" +
      "pid:134809791\n" +
      "eyr:2035 ecl:#44e6cd iyr:1993\n" +
      "\n" +
      "hgt:177in\n" +
      "ecl:utc cid:289\n" +
      "iyr:1923\n" +
      "hcl:13a67a pid:3045345984 byr:2030 eyr:1944\n" +
      "\n" +
      "pid:839901650 eyr:2030\n" +
      "ecl:grn\n" +
      "byr:2015 iyr:2017 hgt:168 hcl:131f4e\n" +
      "\n" +
      "iyr:2015 pid:529736732 ecl:brn hgt:176cm\n" +
      "eyr:2026 byr:1952 hcl:#6b5442\n" +
      "\n" +
      "hcl:#c0946f\n" +
      "cid:323 pid:303966428 iyr:2019\n" +
      "eyr:2027 hgt:170cm\n" +
      "byr:2001\n" +
      "ecl:brn\n" +
      "\n" +
      "pid:193678728 hgt:72in eyr:2027 iyr:2015 byr:1951 ecl:gry hcl:#18171d\n" +
      "\n" +
      "eyr:2026 cid:283\n" +
      "iyr:1938 pid:687430885\n" +
      "hgt:186cm\n" +
      "byr:1949 ecl:#521638 hcl:d13b2f\n" +
      "\n" +
      "eyr:2024 hcl:#ceb3a1 iyr:2013 ecl:brn\n" +
      "hgt:168cm pid:792088241\n" +
      "\n" +
      "hcl:#888785 ecl:amb\n" +
      "byr:2009 iyr:2015\n" +
      "hgt:151cm\n" +
      "eyr:2020 pid:223927808\n" +
      "\n" +
      "byr:1926\n" +
      "pid:717704850\n" +
      "hcl:#623a2f eyr:2022 hgt:64in iyr:2018 ecl:gry\n" +
      "\n" +
      "eyr:2023 byr:1954\n" +
      "hgt:169cm\n" +
      "ecl:hzl\n" +
      "iyr:2010 pid:116868997 hcl:#18171d\n" +
      "\n" +
      "ecl:hzl byr:1965 hcl:#a97842 iyr:2011 pid:506354451 hgt:172cm eyr:2029\n" +
      "\n" +
      "eyr:2022 pid:994565705\n" +
      "iyr:2013 ecl:brn hcl:#623a2f\n" +
      "byr:1979\n" +
      "\n" +
      "iyr:2011\n" +
      "byr:1931 hgt:183cm hcl:#284f26 cid:306\n" +
      "ecl:amb eyr:2021\n" +
      "pid:977533079\n" +
      "\n" +
      "eyr:2027\n" +
      "iyr:2011 ecl:gry\n" +
      "byr:1993\n" +
      "pid:272334781 hgt:161cm hcl:#9a35b6\n" +
      "\n" +
      "eyr:2026\n" +
      "hcl:#602927 ecl:blu\n" +
      "pid:212300161 byr:1946\n" +
      "cid:193 iyr:2020 hgt:157cm\n" +
      "\n" +
      "pid:538594567 byr:1976 eyr:2027 hcl:#efcc98 iyr:2011 hgt:154cm ecl:oth\n" +
      "\n" +
      "byr:1949\n" +
      "hcl:z ecl:#ce67aa\n" +
      "eyr:1942 pid:7978941589 iyr:2025 hgt:161in\n" +
      "\n" +
      "hcl:#c0946f\n" +
      "cid:55\n" +
      "byr:1963 ecl:blu hgt:161cm\n" +
      "pid:547120453 iyr:2015 eyr:2021\n" +
      "\n" +
      "hgt:173cm eyr:2022\n" +
      "iyr:2016 byr:2001\n" +
      "ecl:hzl pid:239803460\n" +
      "\n" +
      "hcl:#b6652a ecl:oth eyr:2021 hgt:167cm pid:401266644 iyr:1969 byr:1974\n" +
      "\n" +
      "eyr:2030 pid:581963885\n" +
      "hcl:#64cb23\n" +
      "ecl:blu\n" +
      "byr:1928 hgt:181cm iyr:2018\n" +
      "\n" +
      "pid:186338247\n" +
      "ecl:hzl hgt:193cm hcl:#ceb3a1\n" +
      "eyr:2022 iyr:2010\n" +
      "\n" +
      "iyr:2015 ecl:gry hgt:159cm eyr:2027 hcl:#ceb3a1\n" +
      "byr:1925 pid:715902111 cid:149\n" +
      "\n" +
      "iyr:2018 hcl:#623a2f eyr:2020 hgt:162cm ecl:grn cid:135\n" +
      "byr:1922\n" +
      "pid:373216777\n" +
      "\n" +
      "eyr:2020 pid:749899012 hcl:#888785 ecl:brn\n" +
      "iyr:2010 cid:225 hgt:172cm\n" +
      "byr:1972\n" +
      "\n" +
      "iyr:2020 hgt:178cm ecl:grn hcl:#18171d pid:613792489 cid:240\n" +
      "eyr:2028\n" +
      "byr:1972\n" +
      "\n" +
      "iyr:2015 byr:1938 eyr:2026\n" +
      "cid:113 ecl:grn\n" +
      "pid:846231640 hgt:161cm\n" +
      "hcl:#b6652a\n" +
      "\n" +
      "ecl:gry\n" +
      "hcl:#ceb3a1\n" +
      "byr:1956 cid:338 pid:936012518\n" +
      "hgt:62in\n" +
      "eyr:2029 iyr:2016\n" +
      "\n" +
      "pid:730866353 ecl:brn byr:1986\n" +
      "iyr:2014\n" +
      "hgt:190cm\n" +
      "eyr:2021 hcl:#a97842 cid:126\n" +
      "\n" +
      "eyr:2021\n" +
      "cid:180 pid:958310635 ecl:brn iyr:2015 hgt:189cm hcl:#efcc98\n" +
      "\n" +
      "hgt:188cm ecl:hzl pid:179001863 iyr:2016 eyr:2029 hcl:#341e13 byr:1932\n" +
      "\n" +
      "cid:77 eyr:2027 hcl:#623a2f iyr:2016 ecl:brn hgt:170cm\n" +
      "byr:1947\n" +
      "\n" +
      "hgt:66in pid:617518313 iyr:2013 byr:1977 hcl:#b6652a ecl:brn eyr:2025\n" +
      "\n" +
      "pid:787861420\n" +
      "iyr:2014 hcl:#623a2f hgt:61in\n" +
      "ecl:oth cid:78\n" +
      "eyr:2022 byr:1975\n" +
      "\n" +
      "ecl:hzl\n" +
      "iyr:2017 eyr:2028 hcl:#602927\n" +
      "byr:1958 pid:985208714\n" +
      "hgt:160cm\n" +
      "\n" +
      "byr:2002\n" +
      "iyr:2013\n" +
      "hcl:#341e13 pid:188110633 ecl:gry hgt:169cm\n" +
      "eyr:2025\n" +
      "\n" +
      "byr:1981\n" +
      "eyr:2028\n" +
      "hcl:#341e13 ecl:amb hgt:160cm cid:121\n" +
      "iyr:2015 pid:963848397\n" +
      "\n" +
      "iyr:2013 hcl:#866857 pid:#db8648 eyr:2021 ecl:gry\n" +
      "byr:1975\n" +
      "hgt:153cm cid:114\n" +
      "\n" +
      "hgt:109\n" +
      "cid:287 hcl:#6b5442\n" +
      "iyr:2028 byr:1926 eyr:2036 pid:2378208387\n" +
      "ecl:#245a62\n" +
      "\n" +
      "pid:857722366\n" +
      "byr:1975 eyr:2027\n" +
      "ecl:grn iyr:2019 hcl:#0afad1\n" +
      "hgt:66in\n" +
      "\n" +
      "byr:1935 hcl:#cfa07d hgt:173cm ecl:brn eyr:2021 iyr:2019\n" +
      "\n" +
      "cid:66 eyr:2024 hcl:#efcc98 byr:2002 iyr:2010\n" +
      "hgt:176cm pid:697153153 ecl:amb\n" +
      "\n" +
      "iyr:2019\n" +
      "hcl:#cfa07d ecl:blu\n" +
      "pid:695914972\n" +
      "eyr:2024\n" +
      "hgt:158cm\n" +
      "byr:1943\n" +
      "\n" +
      "ecl:xry hgt:62in\n" +
      "pid:14733148 cid:148\n" +
      "iyr:2016 byr:1925 hcl:#6b5442\n" +
      "eyr:2028\n" +
      "\n" +
      "iyr:2025\n" +
      "cid:53 hgt:132 ecl:gmt hcl:159b19\n" +
      "pid:156cm\n" +
      "byr:2025 eyr:2001\n" +
      "\n" +
      "hcl:#623a2f ecl:oth byr:1974 iyr:2018 hgt:161cm eyr:2029 pid:6826285172\n" +
      "\n" +
      "ecl:gry\n" +
      "byr:1956 hcl:#7d3b0c hgt:170cm iyr:2020\n" +
      "\n" +
      "eyr:2020\n" +
      "pid:#946a88 hgt:186cm hcl:#733820 byr:1946 ecl:#016645 iyr:2015\n" +
      "\n" +
      "hgt:181cm hcl:#888785 iyr:2013 pid:634152817\n" +
      "byr:1982 cid:245 ecl:grn eyr:2021\n" +
      "\n" +
      "ecl:brn\n" +
      "pid:737531770 iyr:2010\n" +
      "eyr:2020\n" +
      "byr:1929 hgt:189cm hcl:#c0946f\n" +
      "\n" +
      "cid:158 iyr:2019 hcl:#341e13 eyr:2027 ecl:amb\n" +
      "byr:1986 pid:834976623\n" +
      "\n" +
      "pid:976934668 cid:61 eyr:2020 iyr:2020\n" +
      "hgt:76in byr:1927 ecl:amb\n" +
      "hcl:#e05ee3\n" +
      "\n" +
      "pid:526042518 iyr:2019 eyr:2027 hcl:#623a2f byr:1976 ecl:amb\n" +
      "\n" +
      "pid:279367290 hcl:#a97842 hgt:158cm\n" +
      "eyr:2027\n" +
      "byr:1959\n" +
      "iyr:2020\n" +
      "\n" +
      "ecl:xry byr:2028\n" +
      "pid:357216861 hcl:#a97842 eyr:2024 hgt:66cm\n" +
      "iyr:2012\n" +
      "\n" +
      "hgt:188in\n" +
      "ecl:lzr cid:64 eyr:1958 byr:2014 hcl:z pid:285207570 iyr:2026\n" +
      "\n" +
      "eyr:1973 iyr:2017 ecl:oth cid:282 pid:695814158\n" +
      "hcl:z\n" +
      "\n" +
      "iyr:2010 pid:661168409\n" +
      "hcl:#53c696\n" +
      "hgt:186cm ecl:amb\n" +
      "byr:1960\n" +
      "eyr:2029\n" +
      "\n" +
      "eyr:1982 hgt:169cm\n" +
      "iyr:2002 byr:2025 hcl:327f93 pid:831648100\n" +
      "\n" +
      "byr:1967 ecl:oth\n" +
      "eyr:2021\n" +
      "hcl:#602927 iyr:2014\n" +
      "pid:274974402 hgt:183cm";
  protected final List<String> INPUT_PROCESSED =
      Strings.splitAndJoinSections(INPUT);

  private final Pattern regexNumber = Pattern.compile("^\\d+$");
  private final Pattern regexHex = Pattern.compile("#[0-9a-f]{6}");
  protected final PassportProperty[] NEEDED_PROPERTY_NAMES = {
      new PassportProperty("byr",
          value -> onRange(value, 1920, 2002)),
      new PassportProperty("iyr",
          value -> onRange(value, 2010, 2020)),
      new PassportProperty("eyr",
          value -> onRange(value, 2020, 2030)),
      new PassportProperty("hgt",
          this::validateHeight),
      new PassportProperty("hcl",
          value -> regexHex.matcher(value).matches()),
      new PassportProperty("ecl",
          value -> equalsTo(value,
              "amb",
              "blu",
              "brn",
              "gry",
              "grn",
              "hzl",
              "oth")),
      new PassportProperty("pid",
          this::validatePid)};

  public static void main(String[] args) {
    new PassportProcessingOne().resolve();
    new PassportProcessingTwo().resolve();
  }

  private boolean validatePid(String string) {
    if (!isInt(string)) {
      return false;
    }
    return string.length() == 9;
  }

  private boolean equalsTo(String string, String... strings) {
    for (String s : strings)
      if (string.equals(s)) return true;
    return false;
  }

  private boolean validateHeight(String value) {
    String lastTwoChar = value.substring(value.length() - 2);
    int index = value.indexOf(lastTwoChar);
    int number = Integer.parseInt(value.substring(0, index));
    return lastTwoChar.equals("cm")
        ? onRange(number, 150,193)
        : onRange(number, 59, 76);
  }

  private boolean onRange(String value, int least, int most) {
    if (!isInt(value)) return false;
    return onRange(Integer.parseInt(value), least, most);
  }

  @SuppressWarnings("BooleanMethodIsAlwaysInverted")
  private boolean isInt(String string) {
    return regexNumber.matcher(string).matches();
  }

  private boolean onRange(int number, int least, int most) {
    return number >= least && number <= most;
  }

  @Override
  public String getInput() {
    return INPUT;
  }
}