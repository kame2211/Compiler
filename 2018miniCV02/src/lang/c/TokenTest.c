// 16進数
0x0
0xffff
0xfffff	// ビット幅が大きすぎてエラーのはず
0xffgf	// gのところでエラーのはず
0x	// エラーのはず

// 8進数
0
0177777
0277777	// ビット幅が大きすぎてエラーのはず
01786	// 8のところでエラーのはず

// 10進数
65535	// 16ビット符号なし整数の最大値。受理できるはず
65536	// 16ビットで表現できない数なので、エラーにしなくてはいけない
32767	// 16ビット符号付整数の最大値
32768	// これ以上をエラーにする仕様にしてもよい
123a4	// aのところでエラーのはず

