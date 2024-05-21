# Mini Desktop Search Engine

Bu proje, Java programlama dilinde "mini masaüstü arama motoru" uygulayan bir programdır. Bu arama motorunun gerçekleştirdiği görev, belgeler koleksiyonundaki seçili belgeleri kullanıcının istediği kelimeler için aramak ve kelimelerin bulunduğu belgelerin listesini ve bu belgelerdeki kelime sayısını döndürmektir. Ayrıca, bu seçili dosyalardan alınan kelimeler ikili arama ağacına eklenir ve kullanıcı, arayüzdeki "order" düğmelerine basarak tüm kelimeleri istediği gibi listeleyebilir.

## Tasarım

### İkili Arama Ağacı Düğüm Yapısı

Bir ikili arama ağacı düğüm yapısı aşağıdaki gibidir:
![Node Structure](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/9a7ccbc8-64be-4d7d-81f6-8f83e80ae2dd)

BST'deki düğümler yukarıdaki resimde gösterildiği gibi tasarlanmıştır. Bir `bstNode` oluşturulduğunda, şu özelliklerle görünür: sol (left), veri (data, kelime), dosya adlarını ve kelimeye ait sayıları tutan bir bağlı liste (linkedlist) ve sağ (right).

### Arama Motorunun Genel Görünümü

Arama motorunun genel görünümü şu şekildedir:
![Search Engine Overview](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/ebf1a97d-55be-4a02-89a3-8c07af08431c)

## Proje Çıktısı

### Örnek Çıktılar
1)
![Output 1](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/2bc48f4f-219f-475e-b8b8-834d5dfae349)

2)
![Output 2](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/0cf5f932-3bc8-40d1-89f5-ca01523df716)

3)
![Output 3](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/f467217c-833b-41cd-810d-df7a44563cec)
