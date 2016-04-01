# Plans

- Pick up the related artists issue
- Here is a sample request response


## Tabbed interface

found that tabs are old hat.  we should use a viewPager, which supports swipes and  with links (icons) in action bar instead. 

This page explains what we want in some detail
http://www.truiton.com/2015/06/android-tabs-example-fragments-viewpager/

(we also tried another approach, with fragments, which we abondoned)

## Related artist request

```
http://ws.audioscrobbler.com/2.0/?format=json&method=artist.getsimilar&artist=national&api_key=6ce333bc7d6c58c315f628efc7d94f68

{
    "similarartists": {
        "artist": [
            {
                "name": "Kings of Leon",
                "mbid": "6ffb8ea9-2370-44d8-b678-e9237bbd347b",
                "match": "0.409082",
                "url": "http://www.last.fm/music/Kings+of+Leon",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/cb0018d684794a7d8dfcda17d7bd5a6e.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/cb0018d684794a7d8dfcda17d7bd5a6e.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/cb0018d684794a7d8dfcda17d7bd5a6e.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/cb0018d684794a7d8dfcda17d7bd5a6e.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/cb0018d684794a7d8dfcda17d7bd5a6e.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/cb0018d684794a7d8dfcda17d7bd5a6e.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            },
            {
                "name": "Yeah Yeah Yeahs",
                "mbid": "584c04d2-4acc-491b-8a0a-e63133f4bfc4",
                "match": "0.405643",
                "url": "http://www.last.fm/music/Yeah+Yeah+Yeahs",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/d50c755a6d34471d93b76de5b09cd97c.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/d50c755a6d34471d93b76de5b09cd97c.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/d50c755a6d34471d93b76de5b09cd97c.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/d50c755a6d34471d93b76de5b09cd97c.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/d50c755a6d34471d93b76de5b09cd97c.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/d50c755a6d34471d93b76de5b09cd97c.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            },
            {
                "name": "My Morning Jacket",
                "mbid": "ea5883b7-68ce-48b3-b115-61746ea53b8c",
                "match": "0.403588",
                "url": "http://www.last.fm/music/My+Morning+Jacket",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/f3109f0a57af442f828a3566e2a43376.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/f3109f0a57af442f828a3566e2a43376.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/f3109f0a57af442f828a3566e2a43376.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/f3109f0a57af442f828a3566e2a43376.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/f3109f0a57af442f828a3566e2a43376.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/f3109f0a57af442f828a3566e2a43376.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            },
            {
                "name": "Radiohead",
                "mbid": "a74b1b7f-71a5-4011-9441-d0b5e4122711",
                "match": "0.403262",
                "url": "http://www.last.fm/music/Radiohead",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/a276a56ab39b41f68ce338cee2f6a275.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/a276a56ab39b41f68ce338cee2f6a275.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/a276a56ab39b41f68ce338cee2f6a275.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/a276a56ab39b41f68ce338cee2f6a275.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/a276a56ab39b41f68ce338cee2f6a275.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/a276a56ab39b41f68ce338cee2f6a275.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            },
            {
                "name": "The Airborne Toxic Event",
                "mbid": "892fb2e4-0af4-42be-9e60-22898de51d32",
                "match": "0.401250",
                "url": "http://www.last.fm/music/The+Airborne+Toxic+Event",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/63818b8b948d4eb894f043fea0c82a28.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/63818b8b948d4eb894f043fea0c82a28.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/63818b8b948d4eb894f043fea0c82a28.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/63818b8b948d4eb894f043fea0c82a28.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/63818b8b948d4eb894f043fea0c82a28.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/63818b8b948d4eb894f043fea0c82a28.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            },
            {
                "name": "Snow Patrol",
                "mbid": "a66999a7-ae5c-460e-ba94-1a01143ae847",
                "match": "0.399781",
                "url": "http://www.last.fm/music/Snow+Patrol",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/c6bc788e201ed7a3c01be16b78c840ec.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/c6bc788e201ed7a3c01be16b78c840ec.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/c6bc788e201ed7a3c01be16b78c840ec.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/c6bc788e201ed7a3c01be16b78c840ec.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/c6bc788e201ed7a3c01be16b78c840ec.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/c6bc788e201ed7a3c01be16b78c840ec.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            },
            {
                "name": "Franz Ferdinand",
                "mbid": "aa7a2827-f74b-473c-bd79-03d065835cf7",
                "match": "0.399194",
                "url": "http://www.last.fm/music/Franz+Ferdinand",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/cf8178c5fd714f148406d925990a0985.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/cf8178c5fd714f148406d925990a0985.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/cf8178c5fd714f148406d925990a0985.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/cf8178c5fd714f148406d925990a0985.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/cf8178c5fd714f148406d925990a0985.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/cf8178c5fd714f148406d925990a0985.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            },
            {
                "name": "Nada Surf",
                "mbid": "b9a2a9a6-7a40-48a6-bcb1-8eff5b89ad5b",
                "match": "0.399156",
                "url": "http://www.last.fm/music/Nada+Surf",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/568cddc54af34f369393ce697fef3a71.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/568cddc54af34f369393ce697fef3a71.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/568cddc54af34f369393ce697fef3a71.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/568cddc54af34f369393ce697fef3a71.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/568cddc54af34f369393ce697fef3a71.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/568cddc54af34f369393ce697fef3a71.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            },
            {
                "name": "Arctic Monkeys",
                "mbid": "ada7a83c-e3e1-40f1-93f9-3e73dbc9298a",
                "match": "0.395491",
                "url": "http://www.last.fm/music/Arctic+Monkeys",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/376466bb9e2a430bbea0c8cd5f086ee2.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/376466bb9e2a430bbea0c8cd5f086ee2.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/376466bb9e2a430bbea0c8cd5f086ee2.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/376466bb9e2a430bbea0c8cd5f086ee2.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/376466bb9e2a430bbea0c8cd5f086ee2.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/376466bb9e2a430bbea0c8cd5f086ee2.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            },
            {
                "name": "Fleet Foxes",
                "mbid": "fa97dd36-1b82-43d7-a6e4-2adeafd59cef",
                "match": "0.392971",
                "url": "http://www.last.fm/music/Fleet+Foxes",
                "image": [
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/34s/491734da3a464269893556a4019d82e9.png",
                        "size": "small"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/64s/491734da3a464269893556a4019d82e9.png",
                        "size": "medium"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/174s/491734da3a464269893556a4019d82e9.png",
                        "size": "large"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/300x300/491734da3a464269893556a4019d82e9.png",
                        "size": "extralarge"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/491734da3a464269893556a4019d82e9.png",
                        "size": "mega"
                    },
                    {
                        "#text": "http://img2-ak.lst.fm/i/u/arQ/491734da3a464269893556a4019d82e9.png",
                        "size": ""
                    }
                ],
                "streamable": "0"
            }
        ],
        "@attr": {
            "artist": "The National"
        }
    }
}
```

