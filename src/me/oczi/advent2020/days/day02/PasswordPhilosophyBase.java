package me.oczi.advent2020.days.day02;

import me.oczi.advent2020.puzzle.Puzzle;

public abstract class PasswordPhilosophyBase implements Puzzle<String[]> {
  protected final String[] INPUT = {
      "15-16 m: mhmjmzrmmlmmmmmm",
      "5-6 d: dcdddhzld",
      "3-4 s: vqssdcbl",
      "3-6 b: bbhbbbqbbb",
      "10-11 q: cqqntqhqwwh",
      "4-7 g: ggkgggw",
      "4-7 f: fdfffflfvn",
      "11-16 h: thhrhrwhbshshsdhhhhr",
      "7-12 n: nnnnnnvnnnnn",
      "4-5 f: ffxfhldh",
      "9-17 m: mmmmmmmmjmmmmmmmw",
      "2-5 h: hqrfzhhh",
      "4-7 x: vxxfxxjxwvnlx",
      "11-13 h: dhhhhhhhdhhhrh",
      "4-8 q: qqphvphfrlqqkztgslzb",
      "3-15 x: htblqcbdxdzgvhszxz",
      "4-5 j: jjhnn",
      "3-6 l: bwkjllgcjrzhr",
      "5-8 s: ssmsspsss",
      "1-15 d: ddhmhmvlkppkbbdxbc",
      "7-8 l: ltllllllhgzlv",
      "1-15 m: mtmmmvmmbmmfmmkmmmm",
      "1-3 x: xrxzcxcx",
      "5-6 t: tttttdtv",
      "2-5 x: xxxxs",
      "5-7 l: gclqlml",
      "5-10 g: gggggggggn",
      "6-9 j: xwjjfngjgjsjsr",
      "2-7 b: hbqtchkcmblppvqp",
      "16-17 j: jjjjjjjjjjjjjjmjjj",
      "1-5 p: wpppdlpphppp",
      "3-7 q: mspqqqqq",
      "1-4 k: hkjk",
      "3-6 l: llbllldzf",
      "11-14 x: xxnxvxxxxlxxxkv",
      "4-7 k: zkkksmjmrzxftx",
      "2-4 l: lllwq",
      "7-11 q: tbqqmmvkrsz",
      "3-4 f: gwfs",
      "3-5 z: ztszz",
      "2-4 k: kkpzl",
      "1-2 k: kkwckkzwskgbdc",
      "5-7 x: mxxxdxf",
      "1-3 p: pppp",
      "6-8 c: rcqrmcqmpcc",
      "5-6 s: srgvwsc",
      "5-6 w: wwwwwww",
      "2-6 w: xwwzfwr",
      "1-8 z: djzzzcmz",
      "10-14 b: dbwbbbbbldtbbbrbbq",
      "5-15 v: wvzftvfvzkcvjdvvzcj",
      "4-5 j: lrjdmjj",
      "1-15 q: qqqqqqqqqqqqqqkqqq",
      "1-2 w: vwkw",
      "2-4 c: lccsfmkrnrldzbrc",
      "5-14 r: rcpghlsspmvwvzmpvl",
      "7-9 n: nnnnnnnnx",
      "2-19 w: wwwwwwwwwwwwwwwhwbww",
      "6-7 r: rrrrrzc",
      "3-15 w: mnxmfqgklqddfww",
      "9-13 s: tsslqtsszsqsssqssss",
      "5-6 j: jjjtjrb",
      "8-9 f: fffffffwfff",
      "5-7 n: nnnnnnhn",
      "8-17 d: dnfdqvwngbddvbndbsf",
      "13-14 v: vvvvvvvvtvvvvt",
      "2-3 h: hsbnhhhs",
      "2-4 g: ggcgm",
      "2-7 r: rvrrrrrvr",
      "6-9 n: qpxchngsbhxrgqdgbqs",
      "4-8 k: kkkkkkkkd",
      "1-6 v: mrvlldzv",
      "7-10 w: vvwkwrbnwczwww",
      "10-14 k: kkkknkkkkpkkkdmkh",
      "9-10 s: qqbwmssnssjs",
      "5-6 z: bzvdjz",
      "6-13 j: jjjjrzbrjzjmjzjsk",
      "1-6 k: kkkkkrsskk",
      "8-10 v: vvvvvvwvvzvb",
      "10-12 m: mmmmmmmmmdmm",
      "9-10 k: kkkkkkkkjkk",
      "2-8 b: pbcsbbprc",
      "6-7 x: xxxxnpxxxk",
      "3-7 l: llllllml",
      "4-10 j: jrjzjjjcjx",
      "4-5 g: gggmgg",
      "14-15 n: nnnndnnxnnnnntnn",
      "4-6 h: hzqpgbhwh",
      "4-6 b: plzbkbrpscqbxl",
      "5-13 m: hptczmkkmplmw",
      "7-8 r: vjhrhrkdrrrk",
      "3-4 q: qqqq",
      "11-13 s: sssnssssssmsss",
      "11-13 x: xxbhkwvvxgxjh",
      "1-2 f: ftlrdz",
      "1-3 d: mdslnl",
      "2-10 r: xrzbqcxlvtlrsznplk",
      "8-10 w: wwwwmwwtww",
      "2-10 r: zbzplcvnvrr",
      "5-16 c: lcccccclcccgcccccc",
      "3-7 w: wwpwwbww",
      "1-4 s: svsss",
      "6-8 j: jjllkwnjjjgcjpg",
      "3-5 c: cccbb",
      "1-14 j: jpkjjqjjgqmzbjjhjljj",
      "4-9 w: dwwlwwdmkww",
      "7-8 p: pppppppjhqp",
      "1-14 d: djmfmdddkhfqdzfdddd",
      "2-3 r: zrbjhpg",
      "3-4 j: jjkj",
      "3-4 q: qqqq",
      "1-5 k: kkkkwk",
      "6-13 t: ttzxtjtdjtmtttmtt",
      "1-3 x: jxvx",
      "11-12 f: fffffffffffkffffffff",
      "4-5 l: lllhlm",
      "8-10 n: hnnnnnkdfrnntdhnk",
      "1-2 x: gxxx",
      "8-12 w: pwwwwwwfwwww",
      "1-19 p: ppnxfswpxfpbfcpnnpq",
      "10-11 h: hhhphhhhhhgv",
      "1-10 c: dccbvcccccc",
      "7-12 v: vvvvvvrvdvvvvvvvvvvl",
      "2-11 b: jbncfdbbbbcb",
      "3-4 n: nnrn",
      "3-12 s: btnfjtszszssdrsd",
      "3-7 b: bznkfbb",
      "5-6 r: rhprrhrrrhnzjhr",
      "6-18 n: xznnnwwmwnvfnfnlhn",
      "6-11 v: smsvpcjvvgvtvkmvv",
      "12-14 s: sssssssssssssc",
      "5-6 t: ttttfx",
      "7-9 p: pppppnvppp",
      "4-11 s: fbvfqsswshlgr",
      "10-11 n: thnnnnvnnnnnvbnn",
      "2-13 r: dqnvjskcqhmrrtn",
      "10-11 k: kvhkskkfrkr",
      "7-8 s: sssssssm",
      "5-6 d: fddddvv",
      "16-17 q: qqmkfqvvqdqqckqrw",
      "7-13 d: lddrdgdddzddz",
      "14-17 v: vvvvvvvvvqrvvvvvbnqx",
      "1-4 c: ccqn",
      "14-15 t: tbtrrqgtldttmktrt",
      "8-14 c: csccctccrrcwcqc",
      "1-4 n: nnnbnnn",
      "11-14 p: pppppppppppppppppp",
      "4-6 d: hcrkddqddm",
      "1-2 b: xbbbb",
      "2-7 f: cfwqnzbtfnt",
      "7-11 q: qqqqkwqqlqqqq",
      "2-7 g: gtgsgwg",
      "3-4 w: wwks",
      "2-6 j: rjjstgwskhwc",
      "8-15 w: wwwwsgrwwhwjvgqw",
      "5-6 f: ffffhr",
      "1-4 n: kxcn",
      "13-14 k: kkkrkzkkkkkrkhq",
      "2-4 d: fdtpdlbp",
      "4-5 g: ggggg",
      "5-8 x: skzrxxsxxhknxzxxxpnf",
      "4-7 h: ddhhbxnlhfb",
      "4-15 q: wqqlqqqrgqqqwqqqqqq",
      "2-3 j: jjwlnjb",
      "7-13 k: kkxkknjkkkkkksk",
      "3-6 g: ggmgggggggg",
      "3-4 b: bbgbbfd",
      "5-7 j: jjjjwjjj",
      "4-5 x: hvnhxhxxkzxzxc",
      "2-8 r: rlrrwrrrc",
      "11-14 c: ccgccrcccccbhccccm",
      "1-5 f: vfffffffffff",
      "16-17 f: fffffffffffffffff",
      "5-8 n: nwnnngppnn",
      "10-12 m: mmmmmmmmmvmmm",
      "7-9 l: llllllgll",
      "12-16 v: vvvvvvvvvvvlvvvvv",
      "10-12 w: wwwwwxvwwjwwdwwwq",
      "2-8 x: cxjlkdwctx",
      "10-11 d: mdddlndmsdd",
      "1-3 h: bhkfwhjls",
      "6-9 c: cccpcncccc",
      "1-4 c: tzxzctxhpt",
      "10-13 m: mmmsmwmmmsmmcmh",
      "8-9 k: kkkdkkkrb",
      "3-5 x: xkxjxx",
      "6-7 q: cqmxqqqlhtqpgqsqwqqd",
      "5-7 g: ggzggggqg",
      "2-4 n: ncnvzvrk",
      "6-7 k: kkkkkzk",
      "3-7 n: nnnjcmpgtgxqdwjz",
      "3-6 m: zzzvmmmmlmq",
      "1-4 q: nqqqqq",
      "4-5 n: cnnzvn",
      "4-8 s: bscfsnss",
      "8-9 b: pqbtmxfbt",
      "4-13 h: shqjphgfvkrrj",
      "3-8 n: cnphjnhbtndtcn",
      "11-12 f: ffkfzfffbftfffff",
      "6-8 p: ppwppxspppbp",
      "4-5 d: ddddnddd",
      "4-8 n: qnbhwnzxd",
      "3-8 r: csflkrvrq",
      "7-9 z: zzwtzzmzzzzzxdb",
      "4-7 f: wgfffkw",
      "3-6 d: wgmxddvdwtdtknvsz",
      "6-17 w: mzmwwwwzkxwwcvpwrs",
      "1-8 b: bbnltzsmbbfp",
      "2-5 z: tpztzz",
      "6-10 w: rwtwrvwpwwwwpx",
      "11-15 s: sdsssssdsxlpsss",
      "12-14 s: sssvsssssssssr",
      "10-11 x: dqxfvxxxxlx",
      "6-7 z: zqzzzlzz",
      "1-2 t: ftvbp",
      "10-15 d: dddddddddmwdddshdd",
      "8-16 w: wwwfbwwfqwzwvwthjw",
      "6-7 x: xxxxxxpx",
      "11-13 h: hchhhhhhmhfhp",
      "8-11 m: vmmmkmmmxvmmmt",
      "12-18 w: jwmpwwwdwwwwkwswdwz",
      "4-9 f: hwfftvxmpfffff",
      "1-5 n: nhchnnkpn",
      "2-16 l: nlxtpcdlzdkhnmqsvqfg",
      "4-5 r: rrrrr",
      "14-16 d: dddddpgdrddddcdbddd",
      "4-5 j: gskjzxjjz",
      "13-15 s: qsmccrpnsrrvwsk",
      "16-17 f: ffffffflfffffffff",
      "14-15 l: nllcllllvnlwltll",
      "3-4 g: gxghgggdggg",
      "5-10 x: xfxxqljxxkxxx",
      "1-4 q: lmzzq",
      "13-17 x: xxxxxxxxxxxxxxxxt",
      "8-12 b: bbbmxbbbjbbbb",
      "14-19 x: glxxxxhxxxxwxjxxxxc",
      "6-19 d: ndflnddcxksdzdbwdddt",
      "3-9 c: ccccccccl",
      "2-17 z: zrxzbzwzzzzzfzzcz",
      "1-4 m: fmmmml",
      "9-17 l: lllllllllllllbllllll",
      "7-10 r: wgrnrkxrrmrprxrr",
      "2-3 f: vcfff",
      "12-15 t: tttttttttttwtttt",
      "1-7 c: xcccccc",
      "1-9 t: kftttbttchttttttttt",
      "1-4 c: cpkcwmdwxnwvjzfbj",
      "12-16 n: nnnnnnnnlnnnnnnnn",
      "3-4 q: qcjq",
      "4-6 t: tdttkshpmlgqstpttfcc",
      "3-4 j: jjmcxlb",
      "3-19 w: qwdwwhwwjqmwwwwgqwfw",
      "7-12 z: zzgzzzwzkzzb",
      "14-15 c: nccccbdqwdccccd",
      "2-4 k: kkkkrv",
      "14-15 k: kkkkkkkkkkkkkkrkkkk",
      "3-14 s: sspsssssssssstsssss",
      "2-6 r: tdrrrwcrrcrr",
      "1-2 g: gfgg",
      "4-7 z: zczhzkzzccmpg",
      "3-8 t: ttvtscttzcxtt",
      "3-7 q: svkxfrxrvqqpmxzsbk",
      "17-18 p: ppnppppppppppppppb",
      "15-16 b: brbbbbbbbbbbbbpbb",
      "2-4 x: shxx",
      "6-15 m: mmmmmmmmmmmmmmvm",
      "3-4 b: bbbbb",
      "8-10 k: kgkmkkkjkkgkkmk",
      "9-12 j: jtjlwjjjjjml",
      "3-4 w: whwdpqfwghhj",
      "12-13 s: ssssssssssssg",
      "13-19 n: nwdnntnnnqnnqnrbmnmn",
      "14-18 z: zzzzzzzzzzhzzzzzzl",
      "4-11 b: bbbbbbbbbbhbbb",
      "3-19 x: jwxjftcjnkmlgcfgxzmj",
      "6-11 x: xxxxxxxzxmxx",
      "2-4 g: vqgg",
      "5-6 b: bbtbbvhpvbbm",
      "7-9 t: csthttrtttt",
      "10-13 q: qqqqnqgcqnqqqlqcq",
      "8-10 j: jjjjjjjdjw",
      "9-10 v: vrpnvvvvsvqvcvv",
      "2-12 q: jqqqqqwqqqkqkqqq",
      "4-12 z: zrcznzmzzwzzfs",
      "3-6 n: ntnptpnvnns",
      "5-10 d: ddddhddqdd",
      "1-4 l: pcdsl",
      "4-5 d: ddddz",
      "3-10 v: kgnvtcvfvvqkvgwkvj",
      "16-17 x: pdpxctpsxgpjshbxvvq",
      "2-11 k: kkkskkkkkkz",
      "1-4 d: ddddm",
      "3-4 b: bbqm",
      "4-7 b: bbrbbbb",
      "18-19 h: hhhhhhhhhhhhhhhhbhwh",
      "8-10 p: pvlxpppbppppptqbwgp",
      "1-3 w: sfwgwnvghzrn",
      "3-4 l: llwlln",
      "15-19 j: jjjjjjjjjjjjjjbjjjjj",
      "1-7 d: ddddndddd",
      "6-14 c: ccccchcdcccccc",
      "12-17 f: ffxffjffhffzsffffffv",
      "5-9 b: pnbglbbbrdn",
      "8-9 v: vvvvvvfwvvqgc",
      "5-10 l: llklllgllzlm",
      "2-5 t: tttttt",
      "3-7 f: fsfhzcfffvffnrfv",
      "2-5 q: gqqqq",
      "6-7 c: ccccccj",
      "9-13 g: vrgjgkggvpggggggg",
      "4-10 n: nrqnnknbvntszznzmgbn",
      "2-7 x: wslrxrx",
      "4-6 s: ssszbwst",
      "4-6 m: mzmcgnm",
      "6-8 g: gdggggggg",
      "3-6 q: qqqqqknrq",
      "16-17 d: dddddddddddddddzd",
      "4-11 b: bbbpbbbbbbvb",
      "3-4 p: jrppp",
      "2-7 n: wgznngfndc",
      "2-9 f: kcfrnfcpknxfgj",
      "11-14 l: nvdlmzgpllqzllvlqlt",
      "5-6 g: ggggdsgg",
      "15-17 r: kqflshskjhrcgrfcr",
      "13-17 f: gpfwfffffffbfffffff",
      "15-17 s: srssfssshssgsstss",
      "4-8 f: fvfpfbffffb",
      "11-16 w: wwwwwwwwwwwwwwwr",
      "3-4 j: jhjvhwd",
      "4-5 r: rrqtrr",
      "6-14 w: dkwwqwdrxrwwbxwqgww",
      "4-5 s: sssgk",
      "2-4 d: ddtmxd",
      "8-9 w: wwwwwwwwn",
      "2-15 d: rhkgdbbzdszjmbm",
      "2-7 h: jvqmhwbhfqkgzw",
      "6-12 q: qtqqqfqqqqqd",
      "3-5 g: gsxcggzfwgggsl",
      "2-7 p: dprmlmpwpw",
      "9-10 m: mmmmmmmmmkmm",
      "1-4 z: zzzqkfzt",
      "2-8 l: llgllllb",
      "3-12 w: hwwcspbckppcgwb",
      "2-3 s: tnsxtstsstb",
      "1-2 m: fmsm",
      "6-10 q: qnqfqqqqqv",
      "5-10 x: tlgxxwcxgx",
      "8-16 k: kmkknmkgkkkkbkkkkkr",
      "4-16 b: nwbbfcfngbbspnxbj",
      "2-9 m: mmmnmvmvjxmmdmr",
      "5-7 k: fkkkjfbwfkk",
      "2-4 m: tmkfjfqqjmgsjmtz",
      "3-15 z: zzzzzzzzzzzqzzwzzzd",
      "9-10 n: dnnnnnxtnnnnnn",
      "2-3 w: wwwlcwzl",
      "9-10 j: mzbjvzjjvjjgrjj",
      "3-4 d: dhdd",
      "2-6 r: jrcrwjr",
      "9-10 v: bkvvvvvvvjvv",
      "2-6 x: xnwnnx",
      "18-19 k: kkkkkkkkkkkkkkkkkpk",
      "3-5 j: gtjrr",
      "5-6 j: jjjjjj",
      "5-6 k: kkzknk",
      "12-15 t: tttttttttbdlvtq",
      "1-4 d: ddwvz",
      "3-8 f: xlfffrpf",
      "1-2 z: zzdscgwbxtxrd",
      "5-14 n: nsnnnlnnznnxsnnnnnd",
      "9-10 g: gwslkgdgwqdbgws",
      "4-6 f: sfcgkffmfc",
      "10-14 m: dmmwlqmmmmmmmmnm",
      "8-12 n: nnnnnnnnvnnv",
      "15-16 l: lllllllllllllvqlf",
      "1-10 t: tftpttjtnt",
      "2-7 t: ljzdkxtwvbmjtff",
      "2-9 w: stwwlqcbtws",
      "4-6 h: hjwhhvvtpg",
      "3-5 v: vvgvv",
      "8-12 d: ddhcdpdjdddhddmr",
      "10-11 x: kxxllzjrdxlsxx",
      "5-6 f: fffjfrff",
      "17-18 b: bbbbbbbbbbbbhbbbbbbb",
      "3-8 r: znrntdqtmrg",
      "6-12 s: srsvsmsssssssssssss",
      "2-13 z: dzfvpthfxnpnz",
      "7-13 j: jjjjjjrjjcjjw",
      "9-10 l: tllllllljl",
      "12-14 m: mmmmmmmmmmmmmm",
      "17-18 l: llllllllqlllllllggl",
      "1-9 d: dkmqddddzdnrfckdz",
      "6-7 m: gmmmmmlh",
      "13-15 t: ttttxtttttttggbt",
      "6-7 j: jmzvwkjjnjsnjkjxj",
      "1-17 m: gmmnmdvfmmtmmqmmzcj",
      "3-5 l: hvxsjt",
      "7-8 x: kxqczpdxfpjp",
      "2-5 k: kgkkhkdkk",
      "5-7 v: nbjvcgsvf",
      "8-9 d: cxddddnsxd",
      "2-3 p: mmqnjbtbpnmp",
      "11-12 m: jmmmmwvmmhtmmmmlmm",
      "3-14 m: zmmjsqfmqrnzmlmwrjm",
      "3-6 n: vnnnnjn",
      "11-12 j: jjjjjjjcjjjs",
      "13-17 r: rrrrrrrrrrrrrrrrrr",
      "4-5 c: bcncn",
      "2-3 j: bjftxcnzpnjrzxhxlp",
      "9-12 z: tzrlxlzdxzsz",
      "3-5 j: sjtltj",
      "5-7 w: wwwwwww",
      "5-7 p: ppzppcwkvwmwpscfpp",
      "9-10 j: jcjjjjjjjj",
      "3-4 m: mmrm",
      "1-10 k: zkkktkkkkk",
      "5-13 d: bpfldtnfrbdfk",
      "2-3 s: zsskw",
      "6-12 x: xxxxxkxxbxjxlzx",
      "3-9 t: ntgdtbtwnntjbcsfz",
      "6-10 j: sndjqjjdjbfjc",
      "3-4 t: ckqtjtffctwtcp",
      "2-3 v: wvhffpnngzv",
      "7-8 r: tlrncrsg",
      "7-10 g: gjggkfvffg",
      "4-9 x: xpxlxxxmpr",
      "6-9 r: srrrprrrr",
      "7-10 v: gvvnnvhvvvvvdjjvv",
      "4-6 s: psnsgsnfxlscwss",
      "2-4 w: vwwpwx",
      "2-4 b: bbbb",
      "2-16 v: vvvvvvvvvmdvvvvv",
      "3-5 f: ffkffjffff",
      "6-9 q: lqqqqjqqxn",
      "1-5 w: qcvwwwhw",
      "2-10 w: wwwwwwwkjz",
      "6-8 t: tttttttz",
      "13-14 x: xxdxxxhbxxxgcdx",
      "2-4 n: svkl",
      "8-14 f: fffffcfffffffnffw",
      "3-6 n: lsnnnpnnn",
      "11-13 l: lllllllblllll",
      "4-5 s: sssss",
      "3-4 z: zbzt",
      "1-4 x: xxxsx",
      "8-9 c: wlxctcccrqccsccr",
      "5-8 v: vvnvndfqq",
      "4-6 r: rrrtrc",
      "10-15 b: nbbbpfbbbcbzzxbf",
      "4-5 s: sglpschlsgsqbskrd",
      "13-17 k: bvfzktkkkzkkjkkwkf",
      "1-11 x: zkxxxgxxkwxvxgx",
      "15-16 d: dddddddddddddgdwd",
      "2-3 p: pzpprsp",
      "16-19 s: sssbssscjsshwmmszst",
      "11-13 s: stsssssssgmssp",
      "10-11 s: sssssssssgs",
      "5-8 j: jjjjttkj",
      "9-12 s: ssssgsssswsv",
      "16-17 k: kkkkkkkkkkkkkkkwb",
      "9-10 g: bzcdgvrvqg",
      "4-5 n: nnnrn",
      "4-12 n: knnrnnxnnnnjndwn",
      "1-3 m: mtmspm",
      "16-17 b: bbbbbbbbbbbbbbbxb",
      "9-14 m: mmdmqwwbmmlxmjljmm",
      "6-11 z: wzzzzzzzzzzzzszxzvz",
      "2-8 q: qqqqrqqqq",
      "3-4 f: ffhf",
      "9-12 t: ttlqqthvttcttttm",
      "5-8 w: zwwwwlmwwlww",
      "5-7 z: zjjwzkkkjlwzvkp",
      "7-10 z: zkzgzzzxtzz",
      "12-13 v: vvmvvklvvvvgv",
      "10-14 t: ttttttqttttsrttktv",
      "7-10 l: llhlllzllv",
      "1-4 j: blwjjmj",
      "8-10 k: qpffpqskqk",
      "5-9 w: wkdjxcwwswwwwwh",
      "11-13 b: bbbbbbbbbbgtjb",
      "14-16 c: ccccfcbccccccccccc",
      "9-11 l: lflnpwbcmld",
      "8-11 q: qqqqqqflqhtpqq",
      "12-18 z: zzzzzzzzzzzmzzzzzl",
      "4-5 x: xxfhxx",
      "6-16 z: tfrhztxxzzqczznwzz",
      "4-13 l: vlrlmlllldllq",
      "14-15 b: bbwbvbbhbbbbkvnbbbb",
      "3-5 x: frxxx",
      "11-13 f: ffbfffnfffjlffffff",
      "5-6 d: dkrdrgdd",
      "6-8 g: gggwglggvtkglg",
      "1-5 s: sqsnpp",
      "2-4 b: bxjnb",
      "1-2 h: hhfr",
      "10-19 b: tzbpbsbbbtbbbbbbbbbb",
      "3-4 p: pkmcpm",
      "1-8 q: qqqqtqcnqxkqb",
      "13-15 s: ssmssqssssssssts",
      "4-6 q: qqdsqrqq",
      "9-13 z: zzbzzzzpzzzzz",
      "19-20 r: xlrrrgrrrcrktrrhrrrc",
      "9-14 q: qzsrqqqjxwqqhqd",
      "7-15 g: ggggggsggggggggp",
      "4-5 w: wwwkq",
      "7-15 h: ghgpkphhzpmhjpwxq",
      "15-17 v: vcvvvdvvvvvvvpvvhv",
      "1-2 j: qjqbfwbj",
      "3-9 c: nvcwkcndt",
      "14-15 c: cccccccccpccgkclcc",
      "5-6 p: pppppp",
      "12-14 h: hxtxhthhshkrmh",
      "1-2 q: wqjqzqqk",
      "14-15 f: fffffffffffffbqf",
      "7-8 j: vjjjjjfh",
      "7-12 p: trzzppxpptpfp",
      "13-18 w: wwwwwwwmrwwwwwwkwwww",
      "10-11 f: rfffszjfsvn",
      "9-17 l: llllllmlllllllllkl",
      "5-12 s: xssssqssshsss",
      "2-6 x: fxxxsxbnx",
      "4-6 n: nnnnxhnn",
      "10-11 g: gggggggggqg",
      "8-16 n: nknsfcnnnqgnnnxsnfnj",
      "4-7 n: ndnnnnnn",
      "8-9 q: shqphcskmqjqvqqqq",
      "9-10 r: rrrrrjrrrrrr",
      "16-18 z: zfzzzrzzzzzzzzzzzhzz",
      "2-13 g: gkgggqggggggrgg",
      "12-18 v: vvvvvvvvvvvvvvvvvvv",
      "3-4 s: hssq",
      "6-11 h: kdwftsxqcnhph",
      "16-17 t: ttttttttttttttttt",
      "6-11 f: fffffdffffsfffffffff",
      "10-14 p: pppppjvpppppph",
      "10-15 b: bbpbbbbbbtbbbbb",
      "3-7 n: nnnnnnx",
      "3-5 r: rrffrsr",
      "10-13 r: brrrrrrrxrrrrr",
      "6-7 f: ffffkjf",
      "3-7 r: srdrrsrrfrcr",
      "4-9 b: gflbcxtvknsbpjbwrk",
      "8-10 p: pttpkfppcppdznpgpp",
      "13-16 q: qqqqqqqqqqqqqqtqs",
      "1-4 r: rrrwr",
      "1-2 g: zggggggggggg",
      "7-8 j: jjjjjjwb",
      "18-20 t: pwnrvbdzxntvgjjjltqn",
      "8-13 f: fffxffflffffff",
      "4-5 k: cklkk",
      "10-11 m: mmnmmmmmmnm",
      "11-16 q: qqqqqqsqqfsqzqqqq",
      "2-9 n: nnnnnnbnnc",
      "7-11 d: sddnmgfkdddzdd",
      "1-4 f: qfdlftk",
      "8-10 p: pzpppxphphpp",
      "2-4 m: mlwf",
      "6-8 h: jxhhhfztzh",
      "5-8 s: ssnnnssssstsssssd",
      "3-5 x: hlxsx",
      "7-8 h: qhhhhhhwdhph",
      "2-7 v: gxdvcvw",
      "14-15 n: nnnnnkhnfnnnfnnnnnn",
      "9-10 l: lllllllhlnklx",
      "13-18 j: jjjdjcljjjjjjjjjjhj",
      "1-7 h: jkhhhhhhj",
      "9-19 z: tzznzzztcbxkzvssrzzz",
      "12-18 s: sswssscsstnssjssss",
      "4-9 z: zzzxmzgkzspdmq",
      "6-13 d: ndldddpddddddkmdd",
      "8-9 q: zgqrkhxqq",
      "3-6 m: mmmgfdw",
      "1-3 l: dlls",
      "10-11 b: kbbbsbbdbkbqbbbbs",
      "2-4 b: bbbp",
      "5-6 c: xctccckq",
      "3-5 k: kkkkk",
      "12-14 b: bbbbbbzbbnqbbb",
      "6-8 q: jmmhqqlqqkgqcjvqq",
      "11-12 g: ggggpggggghsgg",
      "8-9 h: hhhhchhhbh",
      "10-11 w: zwwcfgwwwwc",
      "5-8 x: xxxxnxlxxx",
      "1-4 f: fffhf",
      "2-3 f: fbwfxr",
      "5-6 f: vrfffd",
      "14-15 r: lrrrrrrrrrrrrfc",
      "7-8 t: tbnptvtt",
      "16-19 r: rrgrrrrrrrrljrrrrrrr",
      "2-4 b: bbpsh",
      "7-13 m: gmmsmmlmmbmmmmmmmgkx",
      "16-17 g: ggggggggggggggrfgg",
      "1-2 g: fcfmr",
      "5-7 l: lclllll",
      "3-5 n: nnnccgvn",
      "1-4 v: npvv",
      "5-11 s: sshsxsswshss",
      "9-12 x: mxxkxxxxsxpkxsxhnktx",
      "3-4 f: fsff",
      "5-11 b: bqzzbcbbbxbk",
      "3-7 s: ssxsssv",
      "6-14 p: pxppjppppppvjp",
      "2-4 h: hhkch",
      "5-7 s: sdshspsssqs",
      "2-8 k: vwkkkkwkskjr",
      "17-18 m: mmmmmmmmmmmrmmmmzm",
      "12-15 w: nwrgwwwjpwwwwpv",
      "3-4 t: ttft",
      "5-11 f: kfffzffzfffk",
      "15-16 d: ddhddddddddcddddd",
      "3-10 l: wplpvlrcqwlblvlcqm",
      "2-5 z: zpzzz",
      "3-5 v: vvgvv",
      "3-4 b: jbgbb",
      "14-15 d: ddddddndddddddd",
      "4-13 z: zszfktzrzjtzzbmn",
      "1-8 b: xbbxrbbbbbb",
      "3-4 t: tttftt",
      "5-9 v: ptvvvcvvvvvnvvvv",
      "1-2 n: tcnnnnln",
      "5-6 h: hhhhhh",
      "10-11 j: jvjjhfjbxjj",
      "4-7 t: twtdttttttttt",
      "12-16 z: zzzzzzzzzwzzzwzzzzzz",
      "7-18 l: hnhcvlnxglxlldlfgvll",
      "2-5 j: jjjjjj",
      "2-8 n: nrknnntn",
      "8-9 z: zzzzzzzqz",
      "4-5 z: zzzzr",
      "1-9 t: bztttgtllwq",
      "8-12 n: ckjnntmkxxcnwkqznp",
      "2-4 b: xbrvvhbbb",
      "1-4 d: dddzqd",
      "13-17 w: wwlwvlwpwwdwwwwqb",
      "3-5 q: lqzmlq",
      "8-9 z: bpzzzczzpzz",
      "1-6 n: nbjqmnhxwh",
      "6-8 q: qqqqqqqzq",
      "16-18 r: rrrrrvrrrrnrrrrrrb",
      "3-8 l: lbfdwlpzmkl",
      "2-3 g: srwcwmgvzjjxj",
      "8-17 w: wwwwwwwjwwwwwwwwww",
      "19-20 t: tttttttttdttttttttvf",
      "1-11 x: pwnwxxfxnkxxtzpglx",
      "6-7 g: lgpglng",
      "5-7 l: llllfll",
      "5-6 p: ppppppp",
      "3-4 x: xxdf",
      "4-15 l: fgkzwrrpmvmhzplsqp",
      "2-4 b: bbqjb",
      "4-6 k: kbkkkwkkk",
      "4-8 p: mppzpprpp",
      "14-17 n: ttfvdtwxnnfdsnxbn",
      "3-5 m: mmzmmm",
      "6-7 k: kkkkndk",
      "1-6 r: hkkrln",
      "4-6 h: hhhhhmhhhhhhh",
      "7-10 k: kkkkkkkkksk",
      "3-4 g: fggggg",
      "5-12 x: qhgrxxhrxjjxxhxgb",
      "3-5 x: lxpxxb",
      "4-7 f: frffsfjff",
      "4-6 d: dpddjfxdrt",
      "11-13 f: fffpxfcfffdfnfzf",
      "12-18 r: rrrrwrrrrrwrrrcfrcr",
      "18-19 q: kqqqqqqqqqqqqnqqqkqq",
      "3-4 b: bgbrf",
      "15-17 s: ssssssssssssssbdss",
      "6-9 d: bnvlpxlctvdd",
      "1-2 s: smsss",
      "2-9 s: cpgrfdfmm",
      "5-12 j: jjjxdqjctjjtnzcjq",
      "9-16 g: xqzgsrdtcvblfpmg",
      "11-15 q: qqqsqqqqwdqqmqqpqh",
      "3-8 d: xddzddtdnk",
      "5-8 p: blppgpppppppx",
      "7-9 m: mqwlxbbcmqf",
      "6-8 t: ltttbttsbtrtts",
      "12-13 k: kqmfkcvkwsnddkk",
      "16-17 t: hrkwqdtckqdktgctj",
      "2-4 m: mmmm",
      "2-11 l: tlflzkxlvlq",
      "5-6 j: jjjjjl",
      "2-13 x: wzfjxsbqznqlx",
      "4-8 s: mssssfzpsh",
      "7-17 v: vvxvvvllvxvvvhrvvv",
      "3-6 h: qchchw",
      "4-10 n: nllnnbnrvnnnmgnzb",
      "16-17 v: vvvfvvvvvvvvpvvvjv",
      "2-14 f: lpbfwlffxhlxfffkf",
      "5-7 w: cfwkwnl",
      "4-6 n: nnnnnn",
      "10-11 d: dcddddddddd",
      "1-2 d: nvrdpnvnlxccjrd",
      "15-16 v: vvjvvvvvvvvvvvhzv",
      "3-4 l: wwlpllqk",
      "2-4 p: pvpp",
      "2-3 b: bmbf",
      "2-12 m: snpdndwgtfqjlzdmmth",
      "5-8 j: rpjjjjlpsj",
      "5-9 g: gdmvgsgjrhg",
      "6-7 p: pppppdspp",
      "2-9 k: dktlkrkwlnd",
      "9-18 b: bbxbbbbbrbbbzbbbbvb",
      "5-9 t: ttqdcwdjtwtqttttbc",
      "8-10 d: njdddddtddhd",
      "4-12 r: fkrfrrrrrrrgr",
      "6-7 s: ssskgxssbs",
      "2-6 m: mtmmmkmm",
      "11-12 h: hhhhjhhhhhgh",
      "8-9 q: kfqkscqnq",
      "6-12 d: sdpddmvdvdxdl",
      "1-8 f: cffzgfffkfff",
      "4-9 v: vvvvcnljw",
      "4-5 p: wplvpp",
      "2-3 w: kxwwww",
      "3-5 m: nmmmmm",
      "2-6 t: ttntttjhctkztt",
      "11-14 v: vvvvvvvvvvqvvf",
      "7-8 z: zzgjqzzzzzdzzkzw",
      "13-15 k: kkkkkkkkfkkkkkk",
      "6-7 m: mmmmmfmgm",
      "7-8 m: fgxsdqmnmmszv",
      "1-3 p: pqppp",
      "8-12 s: sssxqstsssnfsxss",
      "7-10 q: qqqfqqxqqqq",
      "2-5 x: djhvxxm",
      "3-5 b: bjbbbrjgbbxkbgpqd",
      "3-17 c: ccscccjccmclccccccc",
      "8-12 d: djrdgddwxddxskt",
      "7-9 h: hhhhhhzhmh",
      "4-8 l: jwlplsct",
      "6-10 q: qvqhqxnqqmz",
      "1-5 w: wwpwqw",
      "3-12 d: pltzkcsdhphdmdxkb",
      "1-9 k: kkkkkkkkx",
      "2-6 d: dbddqddd",
      "11-13 n: njnrjnnnnnqzn",
      "2-4 k: kkkkkk",
      "11-14 g: gggggggggggcgngg",
      "15-19 v: vxqvvvvvvvxvvvbvvvdv",
      "9-10 s: ssscsssssf",
      "1-14 m: mmmmfmpqmmmmml",
      "6-8 t: sttqtbtjt",
      "5-7 k: vkkshkw",
      "5-7 x: xscxxxm",
      "6-12 d: pddxdddqkdddzmddpd",
      "2-14 t: gtmxtcttqtttxtv",
      "7-14 r: rrrrrrrrrrrrrpr",
      "15-17 d: ddddfdddddddddddmd",
      "4-5 x: xqxxx",
      "11-13 w: wwwwwwwwwwfww",
      "5-6 j: jjjjjj",
      "5-6 m: mmmmmm",
      "1-3 b: fbblbbgbx",
      "7-8 v: vvvvvxvrvd",
      "6-11 f: ffffpwpfqfhfzxdc",
      "11-17 m: mtmdkbvmjmxmmdmmgb",
      "8-12 h: nhbtsbhjhgdh",
      "7-11 w: wwwpwwdwwwd",
      "11-12 f: hffrfffffffqqf",
      "12-13 f: flfcffffffffqdff",
      "2-3 v: hbbv",
      "8-11 d: drdlbdhwdsddd",
      "6-9 w: swrwnbwmkxwt",
      "10-13 l: llflsllllntlll",
      "8-11 v: xvvvvvtkmcvvvxh",
      "3-4 h: hzhbh",
      "11-12 b: bzbbbbbbbgzxbbbbbm",
      "13-17 l: lqwxqmqmjlsmfwltkzl",
      "1-5 l: mwllx",
      "7-8 c: cccnccxcc",
      "6-12 b: tbbsjbkprrdg",
      "3-5 z: zmpzc",
      "5-8 j: jjjltjjj",
      "6-11 z: xzlzgzqhqwgz",
      "4-5 m: mmmmmm",
      "5-6 q: pqwfqh",
      "9-14 p: pppppptfhpzjtct",
      "6-10 w: wdwwwlwwdww",
      "14-17 m: mmmmmsmmmmqmmwmmm",
      "4-5 v: vvhpfnvv",
      "1-7 q: qfqqbxqvqf",
      "6-11 z: zzzzzzzzzzd",
      "6-13 g: gggggfggggggg",
      "12-13 d: ddpdjqdddddmd",
      "8-10 n: nnndnnnnnn",
      "6-7 z: zzgdzzdvz",
      "6-8 n: vdnvnsnnnlnn",
      "3-4 b: bblbl",
      "1-3 f: zpfjkfr",
      "7-9 h: fhtxkhwhgq",
      "7-9 x: xxdxxxpxx",
      "2-3 v: vmxv",
      "18-19 z: zzzzzzzzzzzzzzzzzhrz",
      "4-6 x: hjlsdv",
      "2-3 x: jzxxvkhsxxck",
      "1-9 s: sfjvsjqvss",
      "8-12 j: xxcmpzjjtmkswwr",
      "4-10 s: ssjtvssslwszss",
      "9-16 h: rhhphhhhwwhhhgrhhh",
      "7-8 h: hvhhhhhzh",
      "7-10 m: mmmdqbtssvmfmmmgr",
      "5-7 h: hhbhzhh",
      "5-10 c: ccccqcwxcccc",
      "4-6 q: bmhqqbpfrqfdkq",
      "7-9 r: rcmrdrrrjlrscrrhkl",
      "3-4 t: ttgz",
      "8-12 g: mgggtggggzgzcphhx",
      "6-8 d: dvddfctd",
      "2-3 g: gmglf",
      "1-2 m: dmqwpbhmmktcvc",
      "6-8 z: bzwzzkxqpz",
      "1-9 x: xxxxbwvxcxxcxwznw",
      "3-6 z: zzzzzz",
      "5-6 k: kkkkhk",
      "12-13 q: zqqnrcqqqplqqndfg",
      "9-12 l: jdvxtbqblmllfbnlff",
      "3-6 v: vvkvvv",
      "4-7 v: xbtzjdvp",
      "8-10 h: hhmhhhhhhnmd",
      "7-8 t: ttktgqfzxrdxqf",
      "4-5 g: gggjf",
      "6-9 q: qqqqmmqqqqq",
      "1-10 w: rwjwwwwwrcw",
      "9-13 b: ssbbbcbbbbbbd",
      "2-3 g: bggggv",
      "6-11 w: wwwwfwwxwwww",
      "5-9 p: ppjppppzt",
      "3-14 z: gpzzzdzzjzzpzzzz",
      "1-7 v: vbbfvjz",
      "2-5 q: qdwczqqq",
      "1-5 r: rrrrhwtf",
      "8-14 d: dddddddtdddddddd",
      "7-8 p: ppppppzlp",
      "5-6 s: lbssnssss",
      "1-8 q: lqnpqqqqq",
      "1-4 k: rkqkkk",
      "1-9 z: zgkxmkmgqzg",
      "1-5 b: cbbbbbf",
      "1-4 c: dctcc",
      "4-5 x: sxxtl",
      "2-8 m: qmfqbfmlkkkjzhqjbxpd",
      "8-16 h: lhlghlcbqgsmjhbh",
      "8-9 x: xxxxxxxxx",
      "10-11 l: cvndhntlghk",
      "8-11 d: dddddddcddz",
      "4-5 j: jvjpjj",
      "1-2 d: bmhdpdr",
      "1-4 j: jnjcjnjtd",
      "4-8 m: djsvzshmxmgb",
      "4-10 k: bhpkgzksrkkqk",
      "4-6 l: lllllwlvwlglxqll",
      "9-10 h: hhhhhhhhhm",
      "3-4 q: qqsbq",
      "7-9 l: dlllllgllllszg",
      "10-12 l: lllllllllvlzl",
      "1-5 k: kkkkr",
      "10-11 w: wdwfkwwwwww",
      "8-10 g: rzswrffrqgdhgzm",
      "3-5 z: zzzzz",
      "8-14 p: pplxppppzprpdpjpppdp",
      "6-11 g: mkghrgcmhxggcpddvx",
      "4-6 b: sjwbqv",
      "1-2 q: qvpqlsqqqrnbp",
      "8-20 w: wwwwwwwwwwwwwwwwwwwg",
      "12-15 m: mmmmlmmmmmfwmmm",
      "1-14 x: xxxxvxsxxxxwcjxvxxx",
      "11-14 g: ggdggggggggggx",
      "2-5 r: xrqtf",
      "10-12 q: qqqvqcqjqjfqqxqqkqj",
      "3-4 c: cvszc",
      "2-7 w: mwwwwwvwx",
      "6-8 r: hrgrckfb",
      "4-8 d: ddddgxcznlnwdddd",
      "1-4 c: drhvzzc",
      "3-14 n: pfnjnnhpnppfnrbhz",
      "3-4 n: bnnnb",
      "13-15 h: hhhhhphhhhhthhgh",
      "3-5 l: lfllpmknmplx",
      "1-12 c: lcchctpccccccx",
      "8-9 l: lznsllwlbllmllzl",
      "7-9 w: wwwwqshnwkwwww",
      "10-12 k: zxkknkxkrkckkr",
      "9-12 r: rdrkbkgrrrrznrr",
      "12-13 g: ggggggvgggggr",
      "2-5 g: vgxggr",
      "5-6 c: cccthsc",
      "2-3 t: nptdqmfglpzdvwkspt",
      "4-13 q: qqsxdqqfngqqkqq",
      "17-19 r: rrrrrrrrrrrrrrrrxrf",
      "7-11 t: ttttmthttttt",
      "1-5 l: lllwl",
      "8-12 x: xxxxxxxbxxxwxxx",
      "10-11 d: dddddbfddddcdd",
      "3-5 f: lfffb",
      "1-4 f: ffff",
      "1-9 s: swdckstss",
      "7-9 p: pbfzppbmp",
      "1-2 p: xpqssm",
      "6-16 h: hlhhqdhhmhhhhhphhrh",
      "4-5 b: pbbgxbhqbzvnwxxb",
      "7-10 n: nrbdnnnwnnnlnn",
      "1-2 r: mspcrbgfqs",
      "12-16 l: rlvmtklhllrvljlllx",
      "7-10 p: mpppppprpmjs",
      "6-7 g: gpggwmggggv",
      "1-4 q: qqdqlqq",
      "9-18 x: xxxxxxxxtxxxxxfxxxx",
      "2-4 h: hhhshh",
      "3-4 q: qllq",
      "5-11 g: ggggggggggsg",
      "1-4 r: mrwbr",
      "4-6 m: knhmnm",
      "13-14 p: pppppppppppppp",
      "9-12 v: vvtvvvvfvztvvvxwqlg",
      "11-13 r: rrrrprrrrrzrr",
      "7-11 z: zzzzzzjzzzzz",
      "17-19 d: ddddddddddddddddjdd",
      "4-5 c: ccncdc",
      "4-6 x: gxxvqx",
      "2-3 g: ggpg",
      "6-11 m: blgvnmbxhpmxmb",
      "2-15 w: wvdwwfqjwqwvmfrzw",
      "3-4 s: ssdw",
      "6-7 l: mmllqlcllklxcml",
      "16-17 l: lllplllllllllllllnl",
      "2-4 h: qtwhwz",
      "5-7 v: xvvwfvfvv",
      "4-10 k: kkkkkkkkqkkk",
      "5-6 f: qzvvpf",
      "4-11 d: whhddttshzds",
      "10-13 q: qjlqqqqqpwqqgqq",
      "11-12 w: nwwwdmvwwwwk",
      "4-8 l: rlljllhljl",
      "7-10 s: sssssssssd",
      "2-8 c: qcgrtxrfccgc",
      "7-8 n: pnnngnnnvnwdnn",
      "8-10 c: cscckctxcrhgc",
      "1-4 n: ngnncrnn",
      "6-12 t: ztzqttbmtztpsnrnt",
      "8-12 b: bbbbbbbbbbbb",
      "1-4 z: czzzzzzz",
      "1-2 k: kktmkf",
      "10-14 x: xxxjsxxnxxxxxqxxpx",
      "11-15 v: vxvvrvvvdvvvvvbv",
      "7-9 s: nsslmtsdxbxfsfssswfx",
      "12-15 l: lllllllllllfcltllll",
      "6-7 q: qqqqtqdqq",
      "15-19 n: nnnnnnnnnnnnnnbnnnn",
      "6-8 s: ssttshsks",
      "16-20 r: rrrrprrrjrlqrrsrrrrb",
      "7-10 q: qqqqqqqqqq",
      "3-4 w: wcbw",
      "5-6 g: tcggrxgrgvl",
      "10-12 l: kllswlmlglps",
      "4-7 v: qkvvvvqxjktkvvvjv",
      "5-13 r: rrrrqrrrrrrrrrr",
      "1-2 n: nnnnmb",
      "1-8 x: xktqbxgkkjwlt",
      "3-4 k: kskk",
      "16-17 k: kkdkkkkkkkkkkkkwk",
      "10-15 n: vnnnnnnnnqjnnknnnr",
      "8-15 m: mfmmgmmqmmmmmkmmmmmm",
      "4-8 k: kkkgkkkjkkk",
      "16-17 h: hhhhhhhhhhhlhhhqh",
      "1-4 p: ppprpppppp",
      "1-9 g: gbdxggmggrgw",
      "1-5 f: vfffff",
      "2-12 d: jzvwdmsqpdnh",
      "12-13 w: wwcwgzwwwwwhwwwwww",
      "9-10 z: zzdzzlzvgzzztzzz",
      "4-5 f: ffftff",
      "8-14 x: xxxxxxxrxxxxxx",
      "1-4 r: kgrrvrrvrr",
      "3-4 w: zkpwxkk",
      "2-5 k: tkckkfcvxkxk",
      "3-9 r: rbrrrrgrrrrkbrrr",
      "3-4 t: ttxx",
      "8-11 z: zzzzzzzzzzz",
      "6-10 p: pnwhxpmxpfskq",
      "1-16 d: dddddddddddddddgdddd",
      "1-7 c: kctcccg",
      "1-5 q: sqqqrqqq",
      "14-16 f: fjfffffqfkfffjffff",
      "3-8 v: knvrrqvtv",
      "1-2 p: ptgswlvpdnmr",
      "3-5 v: vvkmnvdwk",
      "10-14 r: rrrrrrrrrhlrwrrrd",
      "2-11 f: xffffxjfffzfffpf",
      "1-5 p: nppppppp",
      "15-16 x: xxxxxxxxxxxxxxsx",
      "15-16 b: prhbmdvwcmtzpvbb",
      "11-14 t: rngdttnzqtjtcttdvbmt",
      "8-10 f: ffvldffqfqffgf",
      "1-3 r: rzqrmz",
      "7-8 n: tntnnnntn",
      "6-14 s: qpvlfbsgswsnwsmpz",
      "9-12 t: tvwstttttttktwt",
      "4-6 g: vslqbgg",
      "9-16 d: dsdddddddrdddddhdbdd"};
  protected int accepted = 0;

  public static void main(String[] args) {
    new PasswordPhilosophyTwo().resolve();
  }
  
  @Override
  public String[] getInput() {
    return INPUT;
  }
}