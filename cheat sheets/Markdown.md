# **Markdown** Cheat Sheet
# Index
- [**General Notes**](#general-notes)
- [**Headings**](#headings)
- [**Text Formatting**](#text-formatting)
- [**Lists**](#lists)
- [**Check-lists**](#check-lists)
- [**Links / URL's**](#links--urls)
- [**Image \& HTML**](#image--html)
- [**Code Blocks**](#code-blocks)
- [**Inline Code Block**](#inline-code-block)
- [**Tables**](#tables)
- [**Quotes**](#quotes)
- [**Detail pane** (collapsible)](#detail-pane-collapsible)
- [**Link to a section**](#link-to-a-section)

## **General Notes**
- In most cases, you can use HTML tags to define the style of markdown text.
- Listed here are the basic elements of Markdown. **This is not an exhaustive list**.

## **Headings**
<!-- Ignore the comments -->
- Default
  # Heading 1
  ## Heading 2      <!-- omit from toc -->
  ### Heading 3     <!-- omit from toc -->
  #### Heading 4
  ##### Heading 5
  ###### Heading 6
- With formatting
  # **Heading 1**
  ## *Heading 2*    <!-- omit from toc -->
  ### ~~Heading 3~~ <!-- omit from toc -->

<hr>

## **Text Formatting**
- Non-HTML
  - **Bold**
  - *Italics*
  - ~~Strike-through~~
- HTML
  - <strong>Bold</strong>
  - <em>Italics</em>
  - <u>Underlined</u>

<hr>

## **Lists**
- Unordered (Item 1)
- Unordered (Item 2)
- Unordered & nested (ordered)
  - Item 1
  - Item 2
  - Item 3
1. Ordered (Item 1)
2. Ordered (Item 2)
3. Ordered & nested (ordered)
   1. Numbered item 1
   2. Numbered item 2
   3. Numbered item 3
4.  Ordered & nested (unordered)
    - Unordered item 1
    - Unordered item 2
    - Unordered item 3
<hr>

## **Check-lists**
* [x] Checked item 1
* [ ] Unchecked item 2
<hr>

## **Links / URL's**
Link 1 - [DuckDuckGo](https://duckduckgo.com/) <br>
Link 2 - [GitHub](https://github.com/)
<hr>

## **Image & HTML**
![Image](res/05-Markdown-Unsplash.png) <br>
Photo by <a href="https://unsplash.com/@wilstewart3?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Wil Stewart</a> on <a href="https://unsplash.com/images/nature?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Unsplash</a>
<hr>

## **Code Blocks**
- Bash
  ```bash
  pacman -Sy
  ```

- Python
  ```python
  print('Hello, world!')
  ```

- HTML
  ```html
  <html>
    <head>
        <title> HTML in Markdown </title>
    </head>
    <body>
        <div id='main'> Hello, world! </div>
    </body>
  </html>
  ```

- Difference
  ```diff
  + This line was added
  - This line was removed
  ```
<hr>

## **Inline Code Block**
`<hr> Everything within a code block is printed as-is on the screen.` <br>
`<br> Hello, World! <br>`
<hr>

## **Tables**
**Note:** 
- **:---** *means* left-align
- **:---:** *means* center-align
- **---:** *means* right-align

| Header 1 | Header 2 | Header 3 |
|   :---   |   :---:  |   ---:   |
| Item 1.1 | Item 1.2 | Item 1.3 |
| Item 2.1 | Item 2.2 | Item 2.3 |
| Item 3.1 | Item 3.2 | Item 3.3 |

<hr>

## **Quotes**
> Quote 1
>> Quote 2
>>> Quote 3
>>>> Quote 4
>>>>> Quote 5
>>>>>> Quote 6

<hr>

## **Detail pane** (collapsible)
<details>
  <summary>Title</summary>
  Line 1 <br>
  Line 2 <br>
</details>

<hr>

## **Link to a section**
- This allows us to create a hyperlink that links to a particular portion of the same document. <br>
  <details>
    <summary>Rules</summary>
    - The link must start with a #. <br>
    - All the words must be in lowercase. <br>
    - Use `-` for all delimiters like spaces, symbols, etc.
  </details>

[Image](#image--html) <br>
[Go back to Topic #1](#markdown-cheat-sheet)