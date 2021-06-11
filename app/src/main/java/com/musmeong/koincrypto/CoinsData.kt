package com.musmeong.koincrypto

object CoinsData {
    private val coinNames = arrayOf("Bitcoin (BTC)",
        "Ethereum (ETH)",
        "Tether (USDT)",
        "Binance Coin (BNB)",
        "Cardano (ADA)",
        "Dogecoin (DOGE)",
        "XRP (XRP)",
        "Polkadot (DOT)",
        "USD Coin (USDC)",
        "Uniswap (UNI)")

    private val coinDetails = arrayOf("Bitcoin is a decentralized cryptocurrency originally described in a 2008 whitepaper by a person, or group of people, using the alias Satoshi Nakamoto. It was launched soon after, in January 2009.\n" +
            "\n" +
            "Bitcoin is a peer-to-peer online currency, meaning that all transactions happen directly between equal, independent network participants, without the need for any intermediary to permit or facilitate them. Bitcoin was created, according to Nakamoto’s own words, to allow “online payments to be sent directly from one party to another without going through a financial institution.”\n" +
            "\n" +
            "Some concepts for a similar type of a decentralized electronic currency precede BTC, but Bitcoin holds the distinction of being the first-ever cryptocurrency to come into actual use.",
        "Ethereum is a decentralized open-source blockchain system that features its own cryptocurrency, Ether. ETH works as a platform for numerous other cryptocurrencies, as well as for the execution of decentralized smart contracts.\n" +
                "\n" +
                "Ethereum was first described in a 2013 whitepaper by Vitalik Buterin. Buterin, along with other co-founders, secured funding for the project in an online public crowd sale in the summer of 2014 and officially launched the blockchain on July 30, 2015.\n" +
                "\n" +
                "Ethereum’s own purported goal is to become a global platform for decentralized applications, allowing users from all over the world to write and run software that is resistant to censorship, downtime and fraud.",
        "USDT is a stablecoin (stable-value cryptocurrency) that mirrors the price of the U.S. dollar, issued by a Hong Kong-based company Tether. The token’s peg to the USD is achieved via maintaining a sum of dollars in reserves that is equal to the number of USDT in circulation.\n" +
                "\n" +
                "Originally launched in July 2014 as Realcoin, a second-layer cryptocurrency token built on top of Bitcoin’s blockchain through the use of the Omni platform, it was later renamed to USTether, and then, finally, to USDT. In addition to Bitcoin’s, USDT was later updated to work on the Ethereum, EOS, Tron, Algorand, and OMG blockchains.\n" +
                "\n" +
                "The stated purpose of USDT is to combine the unrestricted nature of cryptocurrencies — which can be sent between users without a trusted third-party intermediary — with the stable value of the US dollar.",
        "Launched in July 2017, Binance is one of the biggest cryptocurrency exchanges globally. By aiming to bring cryptocurrency exchanges to the forefront of financial activity globally. The idea behind Binance’s name is to show this new paradigm in global finance — Binary Finance, or Binance.\n" +
                "\n" +
                "Aside from being the largest cryptocurrency exchange globally, Binance has launched a whole ecosystem of functionalities for its users. The Binance network includes the Binance Chain, Academy, Trusted Wallet and Research projects, which all employ the powers of blockchain technology to bring new-age finance to the world. Binance Coin is an integral part of the successful functioning of many of the Binance sub-projects.",
        "Cardano is a proof-of-stake blockchain platform that says its goal is to allow “changemakers, innovators and visionaries” to bring about positive global change.\n" +
                "\n" +
                "The open-source project also aims to “redistribute power from unaccountable structures to the margins to individuals” — helping to create a society that is more secure, transparent and fair.\n" +
                "\n" +
                "Cardano was founded back in 2017, and the ADA token is designed to ensure that owners can participate in the operation of the network. Because of this, those who hold the cryptocurrency have the right to vote on any proposed changes to the software.\n" +
                "\n" +
                "The team behind the layered blockchain say that there have already been some compelling use cases for its technology, which aims to allow decentralized apps and smart contracts to be developed with modularity.\n" +
                "\n" +
                "Cardano is used by agricultural companies to track fresh produce from field to fork, while other products built on the platform allow educational credentials to be stored in a tamper-proof way, and retailers to clamp down on counterfeit goods.",
        "Dogecoin (DOGE) is based on the popular \"doge\" Internet meme and features a Shiba Inu on its logo. The open-source digital currency was created by Billy Markus from Portland, Oregon and Jackson Palmer from Sydney, Australia, and was forked from Litecoin in December 2013. Dogecoin's creators envisaged it as a fun, light-hearted cryptocurrency that would have greater appeal beyond the core Bitcoin audience, since it was based on a dog meme. Tesla CEO Elon Musk posted several tweets on social media that Dogecoin is his favorite coin.",
        "To begin with, it’s important to understand the difference between XRP, Ripple and RippleNet. XRP is the currency that runs on a digital payment platform called RippleNet, which is on top of a distributed ledger database called XRP Ledger. While RippleNet is run by a company called Ripple, the XRP Ledger is open-source and is not based on blockchain, but rather the previously mentioned distributed ledger database.\n" +
                "\n" +
                "The RippleNet payment platform is a real-time gross settlement (RTGS) system that aims to enable instant monetary transactions globally. While XRP is the cryptocurrency native to the XRP Ledger, you can actually use any currency to transact on the platform.\n" +
                "\n" +
                "While the idea behind the Ripple payment platform was first voiced in 2004 by Ryan Fugger, it wasn’t until Jed McCaleb and Chris Larson took over the project in 2012 that Ripple began to be built (at the time, it was also called OpenCoin).",
        "Polkadot is an open-source sharding multichain protocol that facilitates the cross-chain transfer of any data or asset types, not just tokens, thereby making a wide range of blockchains interoperable with each other.\n" +
                "\n" +
                "This interoperability seeks to establish a fully decentralized and private web, controlled by its users, and simplify the creation of new applications, institutions and services.\n" +
                "\n" +
                "The Polkadot protocol connects public and private chains, permissionless networks, oracles and future technologies, allowing these independent blockchains to trustlessly share information and transactions through the Polkadot relay chain (explained further down).\n" +
                "\n" +
                "Polkadot’s native DOT token serves three clear purposes: providing network governance and operations, and creating parachains (parallel chains) by bonding.\n" +
                "\n" +
                "Polkadot has four core components:\n" +
                "\n" +
                "Relay Chain: Polkadot’s “heart,” helping to create consensus, interoperability and shared security across the network of different chains;\n" +
                "Parachains: independent chains that can have their own tokens and be optimized for specific use cases;\n" +
                "Parathread: similar to parachains but with flexible connectivity based on an economical pay-as-you-go model;\n" +
                "Bridges: allows parachains and parathreads to connect and communicate with external blockchains like Ethereum.",
        "USD Coin (known by its ticker USDC) is a stablecoin that is pegged to the U.S. dollar on a 1:1 basis. Every unit of this cryptocurrency in circulation is backed up by \$1 that is held in reserve, in a mix of cash and short-term U.S. Treasury bonds. The Centre consortium, which is behind this asset, says USDC is issued by regulated financial institutions.\n" +
                "\n" +
                "The stablecoin originally launched on a limited basis in September 2018. Put simply, USD Coin’s mantra is “digital money for the digital age” — and the stablecoin is designed for a world where cashless transactions are becoming more common.\n" +
                "\n" +
                "Several use cases have been unveiled for the USD Coin. As well as providing a safe haven for crypto traders in times of volatility, those behind the stablecoin say it can also allow businesses to accept payments in digital assets, and shake up an array of sectors including decentralized finance and gaming.\n" +
                "\n" +
                "Overall, the goal is to create an ecosystem where USDC is accepted by as many wallets, exchanges, service providers and dApps as possible.",
        "Uniswap is a popular decentralized trading protocol, known for its role in facilitating automated trading of decentralized finance (DeFi) tokens.\n" +
                "\n" +
                "An example of an automated market maker (AMM), Uniswap launched in November 2018, but has gained considerable popularity this year thanks to the DeFi phenomenon and associated surge in token trading.\n" +
                "\n" +
                "Uniswap aims to keep token trading automated and completely open to anyone who holds tokens, while improving the efficiency of trading versus that on traditional exchanges.\n" +
                "\n" +
                "Uniswap creates more efficiency by solving liquidity issues with automated solutions, avoiding the problems which plagued the first decentralized exchanges.\n" +
                "\n" +
                "In September 2020, Uniswap went a step further by creating and awarding its own governance token, UNI, to past users of the protocol. This added both profitability potential and the ability for users to shape its future — an attractive aspect of decentralized entities.")

    private val coinsImages = intArrayOf(R.drawable.btc,
        R.drawable.eth,
        R.drawable.usdt,
        R.drawable.bnb,
        R.drawable.ada,
        R.drawable.doge,
        R.drawable.xrp,
        R.drawable.dot,
        R.drawable.usdc,
        R.drawable.uni)

    private val coinLinks = arrayOf("https://coinmarketcap.com/currencies/bitcoin/",
        "https://coinmarketcap.com/currencies/ethereum/",
        "https://coinmarketcap.com/currencies/tether/",
        "https://coinmarketcap.com/currencies/binance-coin/",
        "https://coinmarketcap.com/currencies/cardano/",
        "https://coinmarketcap.com/currencies/dogecoin/",
        "https://coinmarketcap.com/currencies/xrp/",
        "https://coinmarketcap.com/currencies/usd-coin/",
        "https://coinmarketcap.com/currencies/polkadot-new/",
        "https://coinmarketcap.com/currencies/uniswap/")

    val listData: ArrayList<Coin>
        get() {
            val list = arrayListOf<Coin>()
            for (position in coinNames.indices) {
                val coin = Coin()
                coin.name = coinNames[position]
                coin.detail = coinDetails[position]
                coin.photo = coinsImages[position]
                coin.link = coinLinks[position]
                list.add(coin)
            }
            return list
        }
}